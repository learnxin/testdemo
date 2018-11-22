package com.example.demo.propertiesmap;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class PropertiesMap {

    public static void main(String[] args) {
        PropertiesMap propertiesMap = new PropertiesMap();

        propertiesMap.propertiesmap();
    }
    public void propertiesmap(){
        /*Properties props = new Properties();
        Map<String, String> map=new HashMap<String, String>();
        InputStream in= getClass().getResourceAsStream("config");
        try {
            props.load(in);
            for (Map.Entry<Object, Object> entry:props.entrySet()
                 ) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                System.out.println("key"+key+"value"+value);

            }
            } catch (IOException e) {
            e.printStackTrace();
        }*/
        try {
            ResourceBundle rb = ResourceBundle.getBundle("config");
            Map map = new HashMap();
            Enumeration enu = rb.getKeys();
            while (enu.hasMoreElements()) {
                Object key = enu.nextElement();
                Object value = rb.getObject(key.toString());
                System.out.println("key: "+key+"  value: "+new String(value.toString().getBytes("ISO-8859-1"),"UTF-8"));
                map.put(key, value);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }
}
