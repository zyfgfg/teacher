package banyuan.com;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner   sc=new Scanner(System.in); //从控制台获取数据
        System.out.println("请输入数值:");
        int  num=sc.nextInt();
        System.out.println(num);
        System.out.println("请输入字符串:");
        String  s= sc.next();
        System.out.println(s);



    }
}
