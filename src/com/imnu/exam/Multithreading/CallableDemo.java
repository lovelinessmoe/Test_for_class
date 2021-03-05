package com.imnu.exam.Multithreading;

import java.util.concurrent.FutureTask;

public class CallableDemo {

    public static void main(String[] args) {
        Imp_Callable imp_callable = new Imp_Callable();
        FutureTask<String> stringFutureTask = new FutureTask<>(imp_callable);
        try {
//            stringFutureTask.run();
            Thread thread = new Thread(stringFutureTask);
            thread.start();
            String s = stringFutureTask.get();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
