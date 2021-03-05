package com.imnu.ThreadCommunication;

public class XiaoFei extends Thread {

    private Product product;

    public XiaoFei(Product product) {
        this.product=product;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("消费了一瓶"+i);
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            notify();
        }
    }
}
