package com.imnu.exam.Multithreading;

import java.util.concurrent.Callable;

public class Imp_Callable implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "苟利国家生死以";
    }
}
