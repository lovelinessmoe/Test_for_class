package com.imnu.IO;

import java.io.*;

public class Buff_FileRW_Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("/Users/loveliness/Desktop/java代码/未命名.txt")));

        String str = "";
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/Users/loveliness/Desktop/java代码/未命名_1.txt"), true));
        while ((str = br.readLine()) != null) {
            bw.write(str + "\n");
        }
        bw.close();
        br.close();
    }
}
