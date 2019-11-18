package banyuan.cn;

import banyuan.com.Person;

public class Tools {
    static Person[] person=new Person[10];
    static int count=0;
    static{
        for (int i = 0; i <3; i++) {
            person[i]=new Person();
            person[i].setName("沾上干"+i);
            person[i].setAddress("下水道"+i);

            count++;
        }
    }


    public  static  void   get(){

        System.out.println("----"+count);
    }


}
