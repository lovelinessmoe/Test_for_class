package com.imnu.Multithreading;

import java.util.concurrent.Callable;

public class Callable_Demo implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().sleep(2000);
        return 1;
    }
}
