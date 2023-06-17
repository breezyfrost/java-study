package com.breezyfrost.chapters02_thread_state;

public class ThreadTimeWaitingStatusDemo {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Thread thread = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        // 启动线程
        thread.start();

        Thread.sleep(1000);

        // 打印线程状态
        System.out.println("线程状态: " + thread.getState());
    }
}
