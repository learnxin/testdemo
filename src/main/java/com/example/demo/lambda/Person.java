package com.example.demo.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private  Boolean weeking;


    @Override
    public int compareTo(Person o) {
        return 1;
    }
}
