package com.example.demo.ObserverPattern.UserJavaUtilSuperObj;

import com.example.demo.ObserverPattern.ObserverAble;

import java.util.Observable;
import java.util.Observer;

public class OtherObserver implements Observer{

    public OtherObserver(Observable observerAble) {

        observerAble.addObserver(this);
    }



    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof OtherDate){
            OtherDate otherDate= (OtherDate) o;
            System.out.println(otherDate.getH()+"____"+otherDate.getT()+arg);
        }

    }
}
