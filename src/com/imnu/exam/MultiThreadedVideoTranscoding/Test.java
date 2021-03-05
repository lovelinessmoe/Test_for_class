package com.imnu.exam.MultiThreadedVideoTranscoding;

public class Test {
    //主线程，实现join和多线程通讯
    public static void main(String[] args) {
        FileUpdata fileUpdata = new FileUpdata();
        Thread file = new Thread(fileUpdata);
        file.start();
        try {
            file.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("视频上传成功，正在转码中");
        VideoTranscoding videoTranscoding = new VideoTranscoding();
        Thread transcoding = new Thread(videoTranscoding);
        transcoding.start();
    }
}
