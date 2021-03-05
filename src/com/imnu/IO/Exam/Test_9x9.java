package com.imnu.IO.Exam;

import java.io.*;

public class Test_9x9 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/loveliness/Desktop/java代码/Test_9x9.txt");
        file.createNewFile();
        BufferedWriter bfw = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                bfw.write(i + "*" + j + "=" + i * j + "\t");
                System.out.println(i * j);
            }
            bfw.write("\r\n");
            System.out.println("\n");
        }
        bfw.close();
    }
}
