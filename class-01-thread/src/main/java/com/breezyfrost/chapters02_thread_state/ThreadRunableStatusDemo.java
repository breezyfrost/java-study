package com.breezyfrost.chapters02_thread_state;

public class ThreadRunableStatusDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (true){

            }
        });
        thread.start();

        System.out.println("线程状态: " + thread.getState());
    }
}
