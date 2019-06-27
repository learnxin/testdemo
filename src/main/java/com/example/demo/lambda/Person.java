package com.example.demo.lambda;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private  Boolean weeking;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public Person(String name, int age, Boolean weeking) {
        this.name = name;
        this.age = age;
        this.weeking = weeking;
    }

    public Person() {
    }

    @Override
    public int compareTo(Person o) {
        return 1;
    }
}
