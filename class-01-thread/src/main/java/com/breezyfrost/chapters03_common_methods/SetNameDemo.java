package com.breezyfrost.chapters03_common_methods;

public class SetNameDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        t1.setName("模块-功能-计数器");
        t1.start();
    }
}