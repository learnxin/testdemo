package com.example.demo.DateTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by crazyboy on 2018/2/2.
 */
public class testman {

    public static void main(String[] args) {
        String regEx = "[`~!@#$%^&*()\\-+={}':;,\\[\\]<>/?￥%…（）_+|\\\\【】‘；：”“’。，、？\\s]";
        Pattern p = Pattern.compile(regEx);
        String str="manhui.jpg";
        Matcher m = p.matcher(str);
        System.out.println(str);
        System.out.println(m.replaceAll("_").trim());
    }
}

