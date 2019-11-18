package banyuan.com.cn.io;

import java.io.File;
import java.io.IOException;

public class IO_Demo1 {


    public static void main(String[] args) throws IOException {
        //什么叫文件？    存储在计算机外部介质中的数据  叫文件
        File   file=new  File("src//1.txt"); //

        System.out.println(file.exists());//显示文件是否存在
        System.out.println(file.length());//表示文件的内容

        System.out.println(file.getName()+"--"+file.getParent());//文件名称、文件的上一个文件夹

        System.out.println(file.getAbsolutePath());  //  /Users/sanye/IdeaProjects/Day_10/src/1.txt
        System.out.println(file.getPath());  //  相对路径 相对于项目的路径

        System.out.println(file.getAbsoluteFile());

        System.out.println(file.canWrite());//能否写入

       System.out.println(file.delete());//文件删除

//        if(!file.exists()){//查看文件是否存在，不存在创建文件
//            System.out.println("........");
//            file.createNewFile();
//        }

       // System.out.println(file.mkdirs());创建文件夹


        System.out.println(file.lastModified());  //1572848674000


        System.out.println(file.isFile());//是否是文件
        System.out.println(file.isDirectory());//是否是文件夹
        System.out.println(file.renameTo(new File("2.txt")));//改名字




    }



}
