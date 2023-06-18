package com.breezyfrost.chapters03_common_methods;

/**
 * yield 不会释放锁
 */
public class YieldDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                if (i == 50) {
                    Thread.yield();
                }
                System.out.println("t1: " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("t2: " + i);
            }
        });

        t1.start();
        t2.start();
    }
}
