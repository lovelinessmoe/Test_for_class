package com.imnu.IO.Exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Count_A_a {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("/Users/loveliness/Desktop/java代码/calcCharNum.txt"));
        //文件统计A_a
        int A_num = 0, a_num = 0;
        int temp = 0;
        while ((temp = fis.read()) != -1) {
//            System.out.println((char)temp);
            if (temp == 'A') {
                A_num++;
            } else if (temp == 'a') {
                a_num++;
            }
        }
        System.out.println("A" + A_num);
        System.out.println("a" + a_num);
        fis.close();
    }
}
