package com.breezyfrost.chapters02_thread_state;

public class ThreadNewStatusDemo {
    public static void main(String[] args) {
        Thread thread = new Thread();

        System.out.println("线程状态: " + thread.getState());
    }
}
