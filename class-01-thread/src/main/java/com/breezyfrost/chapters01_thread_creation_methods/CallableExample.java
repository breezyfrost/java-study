package com.breezyfrost.chapters01_thread_creation_methods;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample {
    public static void main(String[] args) {
        // 创建Callable任务
        Callable<Integer> myCallable = new MyCallable();

        // 创建FutureTask来包装Callable任务
        FutureTask<Integer> futureTask = new FutureTask<>(myCallable);

        // 创建线程来执行FutureTask
        Thread thread = new Thread(futureTask);
        thread.start();

        try {
            // 等待任务执行完成并获取结果
            int result = futureTask.get();
            System.out.println("Callable thread result: " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // 主线程的其他逻辑
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread executing");
        }
    }
}

class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        // 线程执行的代码逻辑
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        return sum;
    }
}
