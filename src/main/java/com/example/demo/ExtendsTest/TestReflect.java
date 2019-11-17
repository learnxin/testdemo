package com.example.demo.ExtendsTest;

import java.lang.reflect.Field;

public class TestReflect {
    public static void main(String[] args) {
        Person person = new Person();
        Class<? extends Person> aClass = person.getClass();
        try {
            Field fullthis = aClass.getDeclaredField("fullthis");
            fullthis.setAccessible(true);
            Object o = fullthis.get(person);

            System.out.printf(o.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
