package com.example.demo.lambda;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class JwtUtil {



    private   String SECRET="testjwt" ;



    private  Integer Expiration=24;

    public  String generateToken(Map map) {

        //you can put any data in the map

        Date nowdate = new Date();
        Date expireDate = getAfterDate(nowdate,0,0,0,Expiration,0,0);
        JwtBuilder builder = Jwts.builder();
//        encodeBase64(map);
        String jwt = builder
                .setClaims(map)
                /*生成签名的时间*/
                .setIssuedAt(nowdate)
                /*签名过期的时间 */
                .setExpiration(expireDate)
                /*签名 Signature */
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
        return jwt;
    }

    public  Map<String,Object> validateToken(String token) {
        try {
            // parse the token.
            JwtParser parser = Jwts.parser();
            Map<String, Object> body = parser
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token)
                    .getBody();
//            decodeBase64(body);
            return body;

        }catch (Exception e){
            throw new IllegalStateException("Invalid Token. "+e.getMessage());
        }
    }

    /**
     * 返回一定时间后的日期
     * @param date 开始计时的时间
     * @param year 增加的年
     * @param month 增加的月
     * @param day 增加的日
     * @param hour 增加的小时
     * @param minute 增加的分钟
     * @param second 增加的秒
     * @return
     */
    public  Date getAfterDate(Date date, int year, int month, int day, int hour, int minute, int second){
        if(date == null){
            date = new Date();
        }

        Calendar cal = new GregorianCalendar();

        cal.setTime(date);
        if(year != 0){
            cal.add(Calendar.YEAR, year);
        }
        if(month != 0){
            cal.add(Calendar.MONTH, month);
        }
        if(day != 0){
            cal.add(Calendar.DATE, day);
        }
        if(hour != 0){
            cal.add(Calendar.HOUR_OF_DAY, hour);
        }
        if(minute != 0){
            cal.add(Calendar.MINUTE, minute);
        }
        if(second != 0){
            cal.add(Calendar.SECOND, second);
        }
        return cal.getTime();
    }


    public void encodeBase64(Map<String,Object> map){
        for (Map.Entry<String,Object> en:map.entrySet()
        ) {

            String key = en.getKey();
            Object value =  en.getValue();

            if(value instanceof String){
                String str=(String) value;
                Base64.Encoder encoder = Base64.getEncoder();
                byte[] encode = encoder.encode(str.getBytes());
                map.put(key,new String(encode)) ;
            }
        }
    }

    public void decodeBase64(Map<String,Object> map){
        for (Map.Entry<String,Object> en:map.entrySet()
        ) {
            String key =  en.getKey();
            Object value =  en.getValue();
            if(value instanceof String){

                String str = (String) value;
                Base64.Decoder decoder = Base64.getDecoder();
                byte[] decode = decoder.decode(str);
                map.put(key,new String(decode)) ;
            }

        }
    }
}
