package com.example.demo.lambda;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 签名工具
 * @author yujiangtao
 * @date 2020/4/2 19:04
 */
public class SignUtil {

    /**
     * 生成token
     *  a)获取当前时间的毫秒数，根据（2*60*1000）取整，即获取2分钟的整。
     *  b)拼接当前页面编码与取整后的时间戳。
     *  c)使用MD5加密，作为token值（表达式为：MD5(页面编码+取整(当前时间戳))）
     * @param pageCode
     * @return
     */
    public static String previewSign(String pageCode) {
        long timeMillis = System.currentTimeMillis();
        long divide = 2 * 60 * 1000L;
        long left = timeMillis / divide;
        String origin = pageCode + left;
        return DigestUtils.md5Hex(origin.getBytes());
    }

    public static void main(String[] args) {
        String sign = previewSign("AP2009I007");
        System.out.printf(sign);

    }
}
