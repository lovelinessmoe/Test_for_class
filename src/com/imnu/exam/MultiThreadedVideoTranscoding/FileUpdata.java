package com.imnu.exam.MultiThreadedVideoTranscoding;

import java.io.*;

public class FileUpdata implements Runnable{
    //文件上传线程
    @Override
    public void run() {
        System.out.println("文件正在上传中。。。。");
        System.out.println("请等待");
        File file = new File("/Users/loveliness/Movies/视频/none.mp4");
        File file1 = new File("/Users/loveliness/Movies/none.mp4");
        byte[] buffer = new byte[1024];
//        int count=0;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file1);
            while ((fileInputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer);
            }
            file.delete();
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
