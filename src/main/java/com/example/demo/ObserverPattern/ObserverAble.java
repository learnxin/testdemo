package com.example.demo.ObserverPattern;

public interface ObserverAble {

    void registerItem(Observer observer);
    void removeItem(Observer observer);
    void notifyItem();
}
