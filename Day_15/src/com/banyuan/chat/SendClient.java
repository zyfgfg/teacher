package com.banyuan.chat;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendClient {

    public static void main(String[] args) throws IOException {
        DatagramSocket  ds=new DatagramSocket();
        InetAddress  ip=InetAddress.getByName("192.168.9.110");
        while(true){
            Scanner  sc=new Scanner(System.in);
            System.out.println("请输入内容:");
            String str=sc.next();

            DatagramPacket   dp=new DatagramPacket(str.getBytes(), str.getBytes().length, ip, 2220);

            ds.send(dp);
            if(str.equals("88")){
                ds.close();
                break;
            }

        }

    }

}
