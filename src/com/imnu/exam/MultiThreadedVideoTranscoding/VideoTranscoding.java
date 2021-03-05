package com.imnu.exam.MultiThreadedVideoTranscoding;

public class VideoTranscoding implements Runnable{
    //视屏转码线程
    @Override
    public void run() {
        try {
            System.out.println("爷在努力转码:0%");
            Thread.sleep(1000);
            System.out.println("爷在努力转码:25%");
            Thread.sleep(1000);
            System.out.println("爷在努力转码:50%");
            Thread.sleep(1000);
            System.out.println("爷在努力转码:75%");
            Thread.sleep(1000);
            System.out.println("爷在努力转码:100%");
            Thread.sleep(1000);
            System.out.println("视频转码成功");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
