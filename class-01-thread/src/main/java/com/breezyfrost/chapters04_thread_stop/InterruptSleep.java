package com.breezyfrost.chapters04_thread_stop;

/**
 * 当我们调用线程的 interrupt() 方法时，如果线程正在阻塞（如处于 Thread.sleep()、Object.wait() 或 Thread.join() 等方法中），
 * 它会抛出 InterruptedException 异常，以便提前结束阻塞状态。
 */
public class InterruptSleep {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread is running...");
                Thread.sleep(5000);
                System.out.println("Thread woke up after sleep.");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted while sleeping!");
               e.printStackTrace();
            }
        });
        thread.start();

        thread.interrupt();
    }
}
