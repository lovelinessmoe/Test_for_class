package com.imnu.ThreadCommunication;


public class Test {

    public static void main(String[] args) {
        //生产线程
        ShengChan shengChan = new ShengChan(new Product("牛奶"));
        shengChan.start();
        //消费
        XiaoFei xiaoFei = new XiaoFei(new Product("牛奶"));
        xiaoFei.start();

    }
}
