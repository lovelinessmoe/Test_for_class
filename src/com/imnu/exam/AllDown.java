package com.imnu.exam;

import java.io.File;

public class AllDown {
    public static void main(String[] args) {
        /*
        遍历down下所有文件和文件夹
        1建立文件对象
        2调用函数，如果是文件，打印名字
        如果是文件夹，进入
         */
        File file = new File("/Users/loveliness");
        fun(file);
    }

    private static void fun(File file) {
        File[] files = file.listFiles();
        for (File file1 : files
                ) {
            if (file1.isDirectory()) {
                System.out.println(file1.getName());
                fun(file1);
            }else {
                System.out.println(file1.getName());
            }
        }
    }
}
