package com.imnu.NetworkProgramming;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

    public static void main(String[] args) {

        try {
            InetAddress inet = InetAddress.getLocalHost();
            //本机域名
            System.out.println(inet.getHostName());
            //本机地址ip
            System.out.println(inet.getHostAddress());
            //全限定域名
            System.out.println(inet.getCanonicalHostName());
            //通过域名获取ip
            System.out.println(InetAddress.getByName("www.baidu.com"));
            //通过地址获取域名

//             InetAddress.getByAddress(new byte[]{110,242,68,3});
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
