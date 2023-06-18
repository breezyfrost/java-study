package com.breezyfrost.chapters04_thread_stop;

public class StopThreadByFlag {
    public static void main(String[] args) {
        StoppableThread thread = new StoppableThread();
        thread.start();

        // 等待一段时间
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 停止线程
        thread.stopThread();
    }
}

class StoppableThread extends Thread {
    private volatile boolean isStopped = false;

    @Override
    public void run() {
        while (!isStopped) {
            // 执行线程的任务
            System.out.println("Thread is running...");
        }
    }

    public void stopThread() {
        isStopped = true;
    }
}
