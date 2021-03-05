package com.imnu.exam.Multithreading;

public class Imp_RunDemo {
    public static void main(String[] args) {
        System.out.println("Main");
        Imp_Runable imp_runable = new Imp_Runable();
        Thread thread = new Thread(imp_runable);
        thread.start();
    }
}
