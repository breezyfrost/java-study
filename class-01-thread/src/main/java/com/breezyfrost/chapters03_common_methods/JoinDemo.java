package com.breezyfrost.chapters03_common_methods;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("t1 start");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("t1 end");
        });

        t1.start();
        t1.join();

        System.out.println("main end");
    }
}
