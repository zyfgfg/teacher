package com.banyuan;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 */
public class ServerThread {
    public static void main(String args[]) throws UnknownHostException, IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Socket s = new Socket("192.168.0.1", 10006);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String len = null;
        for (int i = 0; i < 3; i++) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            bw.write(line);
            String info = br1.readLine();
            if ("登陆成功".equals(info)) {
                break;//如果时我要登陆就表示登陆，那么break就没有意义了}br.close();bw.close();br1.close();s.close();}}}
            }


        }}}
