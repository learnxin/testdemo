package com.example.demo.TestReflect;

import com.example.demo.ObserverPattern.Observer;
import com.example.demo.ObserverPattern.ObserverAble;

public class Hobserver implements Observer{


    private ObserverAble observerAble;

    public Hobserver(ObserverAble observerAble) {
        this.observerAble = observerAble;
        observerAble.registerItem(this);
        System.out.printf("ooo");
    }

    public Hobserver() {
        System.out.printf("zzz");
    }

    @Override
    public void update(float t, float h) {
        System.out.println("i am hobserver"+ h);
    }
}
