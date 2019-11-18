package com.banyuan.com;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class write1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket sc=new DatagramSocket();
        InetAddress sd=InetAddress.getByName("192.168.11.22");
        while(true){
            Scanner sp=new Scanner(System.in);
            String word=sp.next();
            DatagramPacket sf=new DatagramPacket(word.getBytes(),word.length(),sd,1234);
            sc.send(sf);
            if(word.equals("22")){
                sc.close();
                break;
            }

        }

    }
}
