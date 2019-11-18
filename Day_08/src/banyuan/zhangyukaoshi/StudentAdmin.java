package banyuan.zhangyukaoshi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentAdmin {
    static Scanner sr=new Scanner(System.in);
    static List list=new ArrayList();
    static int []sum=new int[20];


    public void menu() {
        System.out.println("请输入选择case 10：添加学生\n" +
                "\tcase 11:查找一个学生\n" +
                "\tcase 12:根据编号更新学生基本信息\n" +
                "\tcase 13:根据编号删除学生\n" +
                "\tcase 14:根据编号录入成绩\n" +
                "\tcase 15:根据某门成绩排序\n" +
                "\tcase 16:根据总成绩排序\n" +
                "\tcase 99:退出系统");
    }

    public void indexOf() {

    }

   public void print(String []arr) {
       for (int i = 0; i <arr.length ; i++) {
           System.out.println(arr[i]);
       }
   }
    public static void create() {
        Student student = new Student();
        System.out.println("请输入编号");
        int num=sr.nextInt();
        student.setNumber(num);
        System.out.println("请输入名字");
        String name=sr.next();
student.setName(name);
        System.out.println("请输入年龄");
        int age=sr.nextInt();
        student.setAge(age);
        System.out.println("请输入phython成绩");
        int phython=sr.nextInt();
        student.setPython(phython);

        System.out.println("请输入java成绩");
        int java=sr.nextInt();
        student.setJava(java);

        System.out.println("请输入linux成绩");
        int linux=sr.nextInt();
        student.setLinux(linux);

        System.out.println("请输入sql成绩");
        int sql=sr.nextInt();
        student.setSql(sql);


        System.out.println("请输入sum成绩");
        int sum=sr.nextInt();
        student.setSum(sum);


        System.out.println("请输入avg成绩");
        int avg=sr.nextInt();
               student.setAvg(avg);
               list.add(student);




    }

    public static void select() {
        Student student =new Student();
        System.out.println("请输入姓名");
        String na=sr.next();
        if(student.getName().equals(na)){
            System.out.println(student.toString());
        }



    }

    public static void update() {

    }

    public static void delete() {
        Student student =new Student();
        System.out.println("请输入姓名");
        String na=sr.next();
        if(student.getName().equals(na)){
list.clear();        }


    }

    public static void input() {
        Student student =new Student();

        System.out.println("请输入编号");
        int num=sr.nextInt();
        if(student.getNumber()==num){
            System.out.println(student);
        }


        }

    public static void courseSort(int []a) {for (int i = 1; i <a.length ; i++) {
        for (int j = 0; j < a.length-i; j++) {
            if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }

        }

    }}

    public static void sumSort(int []a) {
        for (int i = 1; i <a.length ; i++) {
            for (int j = 0; j < a.length-i; j++) {
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

            }

        }

    }
}
