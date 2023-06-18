package com.breezyfrost.chapters03_common_methods;

public class WaitNotifyDemo {
    public static void main(String[] args) {
        final Object lock = new Object();

        // 创建并启动一个等待线程
        Thread waiterThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Waiter正在等待...");
                    lock.wait(); // 等待通知
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // 收到通知后继续执行
            System.out.println("Waiter收到通知，继续执行");
        });

        // 创建并启动一个通知线程
        Thread notifierThread = new Thread(() -> {
            try {
                Thread.sleep(3000); // 等待一段时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock) {
                lock.notify(); // 发送通知
                System.out.println("Notifier发送通知");
            }
        });

        waiterThread.start();
        notifierThread.start();
    }
}
