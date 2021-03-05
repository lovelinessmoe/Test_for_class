package com.imnu.Multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Callable_Test {
    public static void main(String[] args) {
        Callable_Demo calldemo = new Callable_Demo();
        FutureTask<Integer> future = new FutureTask<Integer>(calldemo);
        new Thread(future,"子线程").start();
        try {
//            future.run();
            Integer rs = future.get();
            System.out.println(rs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
