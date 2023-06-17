package com.breezyfrost.chapters02_thread_state;

public class ThreadBlockedStatusDemo {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Thread thread = new Thread(() -> {
            synchronized (lock) {
                System.out.println("hello world");
            }

        });

        synchronized (lock) {
            // 启动线程
            thread.start();
            Thread.sleep(1000);
            // 打印线程状态
            System.out.println("线程状态: " + thread.getState());


        }

    }
}

