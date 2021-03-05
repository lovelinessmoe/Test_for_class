package com.imnu.NetworkProgramming;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class DecodeTest {
    public static void main(String[] args) {
        String url = "http://www.baidu.com?name=苟利国家生死以";

        String encode = URLEncoder.encode(url);
        System.out.println(encode);

        String decode = URLDecoder.decode(encode);
        System.out.println(decode);

    }
}
