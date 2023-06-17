package com.breezyfrost.chapters01_thread_creation_methods;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        // 主线程的其他逻辑
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread executing");
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        // 线程执行的代码逻辑
        for (int i = 0; i < 5; i++) {
            System.out.println("Child thread executing");
        }
    }
}

