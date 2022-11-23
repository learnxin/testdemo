package com.example.demo.lambda;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
public class Person {
    private String name;
    private int age;
    private  Boolean weeking;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
