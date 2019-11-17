package com.example.demo.concurrency;

public class testrun implements Runnable{



        private int ticketCount = 100;

        @Override
        public void run() {
            while (ticketCount > 0) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sale();
            }
        }

        public synchronized void sale(){
            if (ticketCount > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + ticketCount--  + "张票");
//                ticketCount --;
            }
        }

}
