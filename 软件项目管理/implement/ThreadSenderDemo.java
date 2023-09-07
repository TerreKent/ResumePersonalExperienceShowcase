package com.daiinfo.seniorjava.ken7.implement;

import java.io.IOException;
import java.net.*;

public class ThreadSenderDemo extends Thread{
    @Override
    public void run(){
        System.out.println("当前线程的名称为："+Thread.currentThread().getName());
        InetAddress address=null;
        try{
            address=InetAddress.getByName("localhost");
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
        int port=10010;
        byte[] data="用户名：admin；密码：123".getBytes();
        DatagramPacket packet=new DatagramPacket(data, data.length,address,port);
        DatagramSocket socket=null;
        try{
            socket=new DatagramSocket();
        }catch (SocketException e){
            e.printStackTrace();
        }
        try{
            socket.send(packet);
        }catch (IOException e){
            e.printStackTrace();
        }
        byte[] data2=new byte[1024];
        DatagramPacket packet2=new DatagramPacket(data2,data2.length);
        try{
            socket.receive(packet2);
        }catch (IOException e){
            e.printStackTrace();
        }
        String raply=new String(data2,0,packet2.getLength());
        System.out.println("我是客户端，服务器说："+raply);

        socket.close();
    }
}
