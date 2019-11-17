package com.example.demo.concurrency;

public class Exttestrun extends testrun{
    @Override
    public synchronized void sale() {
        System.out.println("i am son");
        super.sale();
    }
}
