package com.imnu.IO.Exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Exam {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/loveliness/Desktop/java代码/HelloWorld.txt");
        file.createNewFile();
        if (file.isFile()) {
            System.out.println("这是个文件");
        } else {
            System.out.println("这是个文件夹");
        }
//        String str = file.getAbsolutePath();
//        str.
        File file_dir = new File("/Users/loveliness/Desktop/java代码/IOTest");
        file_dir.mkdir();
        String str = file_dir.getAbsolutePath();
        File file_new = new File(str+"/HelloWorld.txt");
        //创建文件夹和文件完成
        //使用IO流复制文件
        FileOutputStream fos = new FileOutputStream(file_new);
        //输出流
        FileInputStream fis = new FileInputStream(file);
        //输入流
        byte[] temp = new byte[1024];
        int count = 0;
        while ((count = fis.read(temp)) != -1) {
            fos.write(temp);
        }
        file.delete();
        //移动完成
        //创建list列表
        String[] strs = file_dir.list();

        for (String str_t:strs
             ) {
            System.out.println(str_t);
        }
        //输出list列表
        fis.close();
        fos.close();
    }
}
