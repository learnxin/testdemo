package com.example.demo.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Personson {

    private int age;
    private  Boolean weeking;

    private String test;

    private List<Person> personList;

}
