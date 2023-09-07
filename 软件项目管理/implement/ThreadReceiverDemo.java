package com.daiinfo.seniorjava.ken7.implement;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ThreadReceiverDemo extends Thread{
    @Override
    public void run(){
        System.out.println("当前线程的名称为："+Thread.currentThread().getName());
        DatagramSocket socket=null;
        try{
            socket=new DatagramSocket(10010);
        }catch (SocketException e1){
            e1.printStackTrace();
        }
        byte[] data=new byte[1024];
        DatagramPacket packet=new DatagramPacket(data,data.length);
        try{
            socket.receive(packet);
        }catch (IOException e){
            e.printStackTrace();
        }
        String info=new String(data,0,data.length);
        System.out.println("我是服务器，客户端告诉我"+info);
        InetAddress address=packet.getAddress();
        int port=packet.getPort();
        byte[] data2="欢迎你！" .getBytes();
        DatagramPacket packet2=new DatagramPacket(data2, data2.length,address,port);
        try{
            socket.send(packet2);
        }catch (IOException e){
            e.printStackTrace();
        }
        socket.close();
    }
}
