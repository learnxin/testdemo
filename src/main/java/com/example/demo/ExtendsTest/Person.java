package com.example.demo.ExtendsTest;

import org.springframework.ui.Model;

public class Person extends Mokey{
    private String voice;
    public String fullthis="bbc";


    public static void tests(){
        System.out.println("xuxu");
    }


    @Override
    public void speak(){
        System.out.println(voice);
    }

    @Override
    public String getVoice() {
        return voice;
    }

    @Override
    public void setVoice(String voice) {
        this.voice = voice;
    }

    public Person(String voice) {
        this.voice = voice;
    }

    public Person() {
    }
    @Override
    public void yyf(){
        System.out.println("---------0w0---------");
    }

}
