package banyuan.com;
import banyuan.com.method.Method1;

import   java.util.Scanner;
public class ForAndFor {
    public static void main(String[] args) {
        //菱形   晚上作业  有能力的话 把空心菱形做一下
//          *
//         ***
//        *****
//         ***
//          *
//        out: for (int i=0;i<8;i++){
//            System.out.println("哈哈哈");
//            in: for (int j=1;j<9;j++){
//                if(i>3){
//                    System.out.println(j);
//                    System.exit(0);
//                   // return ;
//                    //continue  in;
//                }
//            }
//        }
            //return :让虚拟机处于待机状态
            // System.exit(0);//强制终止虚拟机
//            for(;;){
//                System.out.println("ssss");
//            }

            //假设  10月22号

            //输入很多数值 并且输入的值相加  直到输入0 结束
        Scanner  sc=new Scanner(System.in);
        int number = sc.nextInt();
        int  sum=0;
        while(number!=0){
            sum+=number;
            number = sc.nextInt();
        }
        System.out.println(sum);
        Method1.method3(45);//ctrl + j 查看对文档注释的说明


    }
}
