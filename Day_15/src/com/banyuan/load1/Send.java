package com.banyuan.load1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 */
class SendThread {
    public static void main(String args[]) throws IOException, IOException {

    ServerSocket ss=new ServerSocket(10006);

    while(true) {

        Socket s=ss.accept();

        ServerThread st=new ServerThread(s);

        Thread t=new Thread(st);

        t.start();

    }

}

}

class ServerThread implements Runnable{

    Socket s;

    ServerThread(Socket s){

        this.s=s;

    }

    @Override
    public void run() {

        for(int i=0;i<3;i++) {

            try {

                BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));

                String name=br.readLine();//等待输入三次

                if(name==null) {

                    break;

                }

                boolean flag=false;

                BufferedReader br1=new BufferedReader(new FileReader("a.txt"));//a.txt中存放登陆密码

                PrintStream ps=new PrintStream(s.getOutputStream());

                String line=null;

                while((line=br1.readLine())!=null) {

                    if(name.equals(line)) {//密码中有一个成立就算登陆成功

                        flag=true;

                        break;

                    }

                    if(flag) {

                        System.out.println("登陆成功");

                        ps.println("登陆成功");

                    }

                    else {

                        ps.println("登陆失败");

                    }

                }

            } catch (IOException e) {

// TODO Auto-generated catch block

                e.printStackTrace();

            }

        }

    }


}
