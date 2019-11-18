package banyuan.Test;

import java.util.Scanner;

/**3.从键盘上输入10个整数，合法值为1,2或3，
 * 不是这3个数则为非法数字。
 * 试编程统记每个整数和非法数字的个数（10分）*/
public class test02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,x=0;
        for (int i = 0; i < 10; i++) {
            int word=sc.nextInt();
            sum+=word;
            if(word==1||word==2||word==3){
            }else{
                x++;
            }

        }
        System.out.println("整数和"+sum+" 非法数字个数："+x);
    }
}
