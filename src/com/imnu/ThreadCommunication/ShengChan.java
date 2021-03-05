package com.imnu.ThreadCommunication;

public class ShengChan extends Thread {
    private Product product;

    public ShengChan(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("生产了一瓶"+i);
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            notify();
        }
    }
}
