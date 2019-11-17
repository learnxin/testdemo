package com.example.demo.concurrency;

public class onecheap {
    private static int y=9;

    public static void main(String[] args) {
        onecheap onecheap = new onecheap();



            new Thread(){
                @Override
                public void run() {
                    while (y<100){

                        onecheap.next();
                    }

                }
            }.start();
            new Thread(){
                @Override
                public void run() {
                    while (y<100){

                        onecheap.next();
                    }



                }
            }.start();




    }
    public void next(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int temp=y;
        y=temp+1;
        System.out.println(y);
    }
}
