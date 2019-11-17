package com.example.demo.TestReflect;

import com.example.demo.ObserverPattern.Observer;
import com.example.demo.ObserverPattern.ObserverAble;
import com.example.demo.ObserverPattern.UserJavaUtilSuperObj.OtherDate;
import com.example.demo.ObserverPattern.WeatherDate;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class TestReflect {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.example.demo.TestReflect.Hobserver");
            Object o = aClass.newInstance();
            Constructor<?>[] constructors = aClass.getConstructors();
            for (Constructor<?> cls :constructors
                 ) {
                System.out.println(cls);

            }
            Constructor<?> constructor = aClass.getConstructor(ObserverAble.class);
            constructor.newInstance(new WeatherDate(new ArrayList<Observer>()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
