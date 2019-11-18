package banyuan.com;

import java.util.Scanner;

public class Tools {

    public static Person [] per=new Person[10];
    public  static  Scanner  sc=new Scanner(System.in);
    static{
        for (int i = 0; i < 3; i++) {
            per[i]=new Person("沾上干"+i,23+i);

        }
    }

    //对对象数组增加数据

    public static  void  addPerson(Person  person){
        //统计一下里面 有效数据
        int  count=0;
        for (int i = 0; i < per.length; i++) {
            if(per[i]!=null){
                count++;
            }
        }
        per[count]=person; // 有没有问题
    }
    //显示对象数组里面数据的方法
    public static void  showInfo(){
        for (int i = 0; i < per.length; i++) {
            if(per[i]!=null)
                System.out.println("---"+per[i].toString());
        }
    }





}
