package com.breezyfrost.chapters04_thread_stop;

public class InterruptDemo {
    public static void main(String[] args) {
        // 线程默认情况下， interrupt 为 false
        System.out.println(Thread.currentThread().isInterrupted());
        // 执行 interrupt 后，为 true
        Thread.currentThread().interrupt();
        System.out.println(Thread.currentThread().isInterrupted());
        // interrupted 方法返回当前 interrupt 标志并归位为 false
        System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
    }
}
