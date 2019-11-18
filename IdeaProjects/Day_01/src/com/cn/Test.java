package com.cn;

import java.io.IOException;
import java.lang.String;
public class Test {
    public static void main(String[] args) throws IOException {
        //获取文件的绝对路径
        //Scanner  sc=new Scanner(Paths.get("//Users//banyuan//java//Hello.java"),"UTF-8");


            if (args.length == 0 || args[0].equals("_h")) {
                System.out.print("Hello,");
            }else if (args[0].equals("-g")){
                System.out.print("Goodbye,");
            }
            // print the other command-line arguments
            for (int i = 1; i < args.length; i++)
                System.out.print(" " + args[i]);
            System.out.println("!") ;
  //   /Users/banyuan/IdeaProjects/Day_01/src/com/cn/Test.java

    }

}
