package com.example.demo.concurrency;

public class TestSynchronize {

    String[] a={"1"};
    String[] b=new String[2];


    public void syn1(){
        synchronized (a){
            System.out.println(Thread.currentThread().getName()+"进入时间"+System.currentTimeMillis());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"离开时间"+System.currentTimeMillis());

        }

    }


    public void syn2(){
        synchronized (a){
            System.out.println(Thread.currentThread().getName()+"进入时间"+System.currentTimeMillis());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"离开时间"+System.currentTimeMillis());

        }
    }

    public static void main(String[] args) {

        TestSynchronize testSynchronize = new TestSynchronize();

        new Thread(){
            @Override
            public void run() {
                testSynchronize.syn1();
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                testSynchronize.syn2();
            }
        }.start();
    }
}
