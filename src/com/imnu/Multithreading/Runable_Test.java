package com.imnu.Multithreading;

class Runable_Demo implements Runnable {
    private String name;

    public Runable_Demo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name);
    }
}

public class Runable_Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runable_Demo("狗蛋"));
        thread.start();
    }
}
