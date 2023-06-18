package com.breezyfrost.chapters04_thread_stop;

public class InterruptBlock {
    public static void main(String[] args) throws InterruptedException {
        final Object lock = new Object();

        Thread thread = new Thread(() -> {
            synchronized (lock) {
                while (true) {
                    System.out.println("Thread is running...");
                }
            }
        });

        synchronized (lock) {
            thread.start();
            Thread.sleep(500);
            // 中断线程
            thread.interrupt();
            Thread.sleep(2000);
            System.out.println(thread.getState());
            Thread.sleep(5000);
        }
    }
}
