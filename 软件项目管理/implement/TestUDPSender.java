package com.daiinfo.seniorjava.ken7.implement;

public class TestUDPSender {
    public static void main(String[] args){
        ThreadSenderDemo td=new ThreadSenderDemo();
        Thread t1=new Thread(td);
        Thread t2=new Thread(td);
        t1.setName("线程1");
        t2.setName("sss");
        t1.start();
        t2.start();
    }
}
