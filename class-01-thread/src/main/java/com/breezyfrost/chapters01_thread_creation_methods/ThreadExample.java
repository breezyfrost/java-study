package com.breezyfrost.chapters01_thread_creation_methods;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();

        // 主线程的其他逻辑
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread executing");
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        // 线程执行的代码逻辑
        for (int i = 0; i < 5; i++) {
            System.out.println("Child thread executing");
        }
    }
}
