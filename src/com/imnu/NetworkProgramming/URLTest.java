package com.imnu.NetworkProgramming;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {

    public static void main(String[] args) {
//        try {
//            URL url = new URL("https://www.baidu.com:8080?id=123&name=sdf#sss");
//            System.out.println(url.getPort());
//            System.out.println(url.getRef());
//            System.out.println(url.getQuery());
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
        BufferedReader bufferedReader = null;
        URLConnection urlConnection = null;
        FileWriter fileWriter = null;

        try {
            URL url = new URL("https://www.baidu.com");
            urlConnection = url.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            fileWriter = new FileWriter(new File("/Users/loveliness/Desktop/大学/baidu.html"));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
                fileWriter.write(str);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
