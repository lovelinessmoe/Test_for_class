package com.imnu.IO.Exam;

import java.io.*;
import java.util.Scanner;

public class Name_rand {
    public static void main(String[] args) throws IOException {
        BufferedWriter bfw = new BufferedWriter(new FileWriter(new File("/Users/loveliness/Desktop/java代码/name.txt")));
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine()+"\r\n";
            //txt中文本换行\r\n
            bfw.write(str);
        }//输入每一个名字保存到txt
        bfw.close();

        BufferedReader bfr = new BufferedReader(new FileReader(new File("/Users/loveliness/Desktop/java代码/name.txt")));
        String[] strs = new String[5];
        String str = "";
        int i=0;
        while ((str = bfr.readLine()) != null){
            strs[i++]=str;
        }//读取文件每一行到strs中
        int index = (int) ((Math.random() * 10) % 5);
        System.out.println(strs[index]);
        bfr.close();

    }
}
