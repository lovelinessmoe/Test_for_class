package com.imnu.IO;

import java.io.File;
import java.io.FilenameFilter;

public class Java_Rtf_sum {
    public static void main(String[] args) {
        int java_count = 0, rtf_count = 0, sum_count = 0;
        File file = new File("/Users/loveliness/Desktop/java代码");
            /*
        String[] FileList = file.list();
        for (String string : FileList
                ) {
            if (string.endsWith(".java")) {
                java_count++;
                sum_count++;
                System.out.println("java:" + string);
            } else if (string.endsWith(".rtf")) {
                rtf_count++;
                sum_count++;
                System.out.println("rtf" + string);
            }
        }
        */


        String[] File_List = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (dir.isFile()) {
                    return true;
                } else {
                    return false;
                }
            }
        });

        for (String string : File_List
                ) {
            if (string.endsWith(".java")) {
                java_count++;
            } else {
                rtf_count++;
            }
        }

        System.out.println("javacount有" + java_count);
        System.out.println("txtcount有" + rtf_count);
        System.out.println("总共有" + sum_count);
        System.out.println("总共有" + File_List.length);

    }
}
