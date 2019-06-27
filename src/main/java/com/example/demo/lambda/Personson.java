package com.example.demo.lambda;

public class Personson {

    private int age;
    private  Boolean weeking;

    private String test;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getWeeking() {
        return weeking;
    }

    public void setWeeking(Boolean weeking) {
        this.weeking = weeking;
    }

    public Personson(int age, Boolean weeking) {

        this.age = age;
        this.weeking = weeking;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Personson() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
