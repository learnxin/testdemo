package com.example.demo.ObserverPattern;

public class Hobserver implements Observer{


    private ObserverAble observerAble;

    public Hobserver(ObserverAble observerAble) {
        this.observerAble = observerAble;
        observerAble.registerItem(this);
    }

    public Hobserver() {
    }

    @Override
    public void update(float t, float h) {
        System.out.println("i am hobserver"+ h);
    }
}
