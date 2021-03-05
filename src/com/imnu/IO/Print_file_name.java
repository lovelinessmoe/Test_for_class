package com.imnu.IO;

import java.io.File;

public class Print_file_name {
    public static void main(String[] args) {
        File file = new File("/");
        printFileName(file);
    }

    private static void printFileName(File file) {
        File[] files = file.listFiles();
        for (File file1:files
             ) {
            if(file1.isFile()){
                System.out.println("文件"+file1.getName());
            }else {
                printFileName(file1);
                System.out.println("文件夹"+file1.getName());
            }
        }
    }


}
