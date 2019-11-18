package banyuan.oop4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ObjArr {

    public static void main(String[] args) {
//        int  [] arr={};
//        String [] str={};
//        Student  [] student ={};
//        Student  [] s=new Student[5]; //
//        s[0].setName("jax");
//        s[1].setAge(4);

        // 现有一群人n, 人的属性: 姓名  年龄   住址  性别
        // 请根据这群人的年龄大小进行升序排序  并且把排序之后的人的相关信息在控制台显示

        Scanner  sc=new Scanner(System.in);
        System.out.println("请输入人数:");
        int   n=sc.nextInt();

        Student   []  stu=new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第"+(i+1)+"个人的姓名:");
            String  name=sc.next();
            System.out.println("请输入第"+(i+1)+"个人的年龄:");
            int age=sc.nextInt();
            System.out.println("请输入第"+(i+1)+"个人的地址:");
            String  address=sc.next();
            System.out.println("请输入第"+(i+1)+"个人的性别:");
            String  sex=sc.next();
            Student st=new Student();
            st.setName(name);
            st.setAge(age);
            st.setAddress(address);
            st.setSex(sex);
            stu[i]=st;
        }


        for (int i = 0; i <stu.length-1; i++) {
            for (int j = 0; j <stu.length-1-i; j++) {
                 if(stu[j].getAge() > stu[j+1].getAge()){
                     Student t=stu[j];
                     stu[j]=stu[j+1];
                     stu[j+1]=t;

                 }
            }
        }

        for (int i = 0; i <stu.length; i++) {
            System.out.println(stu[i].toString());
        }

















    }

}
