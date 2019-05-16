package com.example.demo.concurrency;

public class runmain {
    public static void main(String[] args) {

    testrun ticketThread = new testrun();
    Thread t1 = new Thread(ticketThread, "窗口1--");
    Thread t2 = new Thread(ticketThread, "窗口2--");
    t1.start();
    t2.start();
    }
}
