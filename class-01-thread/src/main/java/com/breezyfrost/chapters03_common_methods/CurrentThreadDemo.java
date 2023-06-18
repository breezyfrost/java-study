package com.breezyfrost.chapters03_common_methods;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println(main);
    }
}
