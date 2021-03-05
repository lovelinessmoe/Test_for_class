package com.imnu.NetworkProgramming.SocketTest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(28888);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(inputStream, "utf-8");
            int ch;
            while ((ch = isr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
