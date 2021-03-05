package com.imnu.exam.Multithreading;

public class ThreadDemo extends Thread {
    //通过Thread实现


    @Override
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        System.out.println("Mian");
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
    }
}