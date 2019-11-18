package banyuan.oop2;

public class TestPerson {
    public static void main(String[] args) {
        Student  per=new  Student();
        per.setName("沾上干");
        per.setAge(45);
        System.out.println(per.toString());


        Tools  tool=new Tools();
       // tool.showInfo(per,"java工程师");
        /*
             如果参数里面的数据是类或者其他引用类型      那么接收到的是一个具体的对象名字
               一个类如果作为方法的形参  那么他接收的一定是该类的实体对象(在堆内存的地址)
         */

        Student  s=tool.showInfo(per,"java"); //调用者里面所调用的方法里面的参数叫实际参数
        System.out.println(s.getName());



        int [] arr={12,3,4,56,7,9};
        int []  arr2=tool.getArr(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }


        Student  st=new  Student(); //在内存中做了那些事情？
        /*
            1.加载Student.class文件
            2.在栈里面为st开辟一个空间
            3.在堆里面开辟一个对象空间
            4.为对象进行初始化
            5.（对对象显示初始化）
            6.把堆里面的对象地址赋值给 栈里面的st
         */




    }
}
