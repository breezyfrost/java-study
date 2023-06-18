package com.breezyfrost.chapters04_thread_stop;

/**
 * stop() 方法会立即停止线程的执行，将线程的状态置为已停止。它会导致线程立即中断，无论线程是否正常完成了它的任务或释放了它所持有的锁。
 * 因此，stop() 方法可能导致线程在不确定的状态下结束，使得应用程序处于不一致的状态。
 */
public class StopDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (true) {
                // 执行线程的任务
                System.out.println("Thread is running...");
            }
        });
        thread.start();

        // 等待一段时间
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 停止线程
        thread.stop();
    }
}
