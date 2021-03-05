package com.imnu.NetworkProgramming.SocketTest;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTest {

    //客户端
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            socket = new Socket("127.0.0.1", 28888);
            outputStream = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(outputStream, "utf-8");
            while (true) {
                Scanner sc = new Scanner(System.in);
                osw.write(sc.next());
                osw.flush();
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            try {
//                socket.close();
//                outputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }
}
