package com.example.demo.TestAnnotation;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: wangran
 * @Description: ${description}
 * @Date: 2019/7/5 20:56
 */
public class Test {

    private static HashMap<Dict,Object> map=new HashMap();

    @org.junit.Test
    public void testAnnotation() throws ClassNotFoundException {
        Class<?> org = Class.forName("com.example.demo.TestAnnotation.Organization");

        Field[] fields = org.getDeclaredFields();

        List<Field> collect = Arrays.stream(fields).filter(e -> e.isAnnotationPresent(Dict.class)).collect(Collectors.toList());
        collect.forEach(
                e->{
                       Dict dict = e.getAnnotation(Dict.class);
                    try {
                        Field declaredField = org.getDeclaredField(dict.srcField());

                    } catch (NoSuchFieldException e1) {
                        e1.printStackTrace();
                    }
                    System.out.println("dictType:" + dict.dictType() + " srcField:" + dict.srcField());


                }
        );
    }
    @org.junit.Test
    public void testDate(){

        String str="03020101680000000000702CF52E87462627A9EAECDA6D54862550BC892CC5137BAFCC63332AC2E1C5AE2547A92D56A87FF3BC85640272E8C4977B50F8";
        System.out.printf(str.length()+"");
    }
    @org.junit.Test
    public void testList(){

        String[] strs=new String[5];
        chackArray(strs,"");

    }

    /** 校验数组长度 */
    public static void chackArray(String[] array,String msg){

        if(array.length==0){
            throw new IllegalArgumentException(msg);
        }

    }

}
