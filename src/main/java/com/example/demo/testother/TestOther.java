package com.example.demo.testother;

import org.junit.Test;

/**
 * @Author: wangran
 * @Description: ${description}
 * @Date: 2019/7/10 10:16
 */
public class TestOther {
    @Test
    public void testsubstring(){
        String str="123456";
        String substring = str.substring(0, 5);
        String substring1 = str.substring(4);
        System.out.print(substring);
    }


    @Test
    public void testStringBuilder(){
        int num=1;
        StringBuilder str = new StringBuilder();
        int len = 6 - (num + "").length();
        for (int i = 0; i < len; i++) {
            str.append("0");
        }
        str.append(num);
        System.out.print(str.toString());
    }


}
