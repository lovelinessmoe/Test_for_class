package com.imnu.Multithreading;

public class Thread_Test extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("爷来了");
    }

    public static void main(String[] args) {
        System.out.println("main开始");
        Thread_Test thread_test = new Thread_Test();
        //对象实li化自己
        thread_test.start();
//        thread_test.interrupt();//中断线程
//        thread_test.start();
        System.out.println("main结束");
    }
}
