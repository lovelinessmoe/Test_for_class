package com.imnu.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Reader;

public class FileStream_Test {
        public static void main(String[] args) throws Exception {
            FileInputStream fis = new FileInputStream(new File("/Users/loveliness/Desktop/java代码/未命名.txt"));
            byte[] buffer = new byte[1024];
            int count = 0;
            File file = new File("/Users/loveliness/Desktop/java代码/未命名_1.txt");
            FileOutputStream fos = new FileOutputStream(file, true);
            //true为追加，默认不写为false
            while ((count = fis.read(buffer)) != -1) {
                fos.write(buffer);
            }
//        reader = new Reader()
            fos.close();
            fis.close();
        }
}
