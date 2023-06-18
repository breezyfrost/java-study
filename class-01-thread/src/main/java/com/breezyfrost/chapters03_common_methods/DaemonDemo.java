package com.breezyfrost.chapters03_common_methods;

/**
 * JVM 会在程序中没有非守护线程时退出
 */
public class DaemonDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("t1: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.setDaemon(true);
        t1.start();
    }
}
