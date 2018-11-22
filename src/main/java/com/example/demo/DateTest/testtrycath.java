package com.example.demo.DateTest;

public class testtrycath {

    public static void main(String[] args) {
        String vvm=null;
        try {

            try {
                System.out.println(1/0);
            } catch (Exception e) {
                e.printStackTrace();
                vvm="yyf";
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("0w0");
        }
        System.out.println(vvm);
    }
}
