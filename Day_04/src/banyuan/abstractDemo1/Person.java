package banyuan.abstractDemo1;

public abstract class Person {

    public  String name="爸爸";



    public  static  final int  AGE=34;

    public Person(){
        System.out.println("我是抽象类里面的无参构造方法...");
    }



    public abstract void  eat();

    public abstract    void  sleep();

    //能不能有普通方法

    public   void  sleep2(){
        System.out.println("我是抽象方法里面的普通方法");
    }

    public  static   void  method(){
        System.out.println("我是静态方法");
    }



}
