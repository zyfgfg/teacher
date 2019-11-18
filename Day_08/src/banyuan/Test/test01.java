package banyuan.Test;
/**2.依次输入5句话，然后将它逆序输出 （5分）*/
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String []word=new String[5];
        for (int i = 0; i <5 ; i++) {
            System.out.println("请输入"+(i+1)+"句话");

        String st=sc.next();word[i]=st;
        }

        for (int i = 0; i <word.length/2; i++) {
            String temp=word[i];
            word[i]=word[word.length-1-i];
            word[word.length-1-i]=temp;

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(word[i]);
        }
    }
}
