package com.daiinfo.seniorjava.ken7.implement;

public class TestUDPReceiver{
    public static void main(String[] args){
        ThreadReceiverDemo t2=new ThreadReceiverDemo();
        Thread tt=new Thread(t2);
        tt.setName("线程2");
        tt.start();
    }
}
