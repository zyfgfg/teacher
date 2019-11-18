package banyuan.abstractDemo1;

public class Student extends  Person {

    public String name="儿子";

    public  Student(){
        //super();
        System.out.println("我是student类里面的无参构造方法...");
    }



    @Override
    public void eat() {
        System.out.println("这是student的eat");
    }

    @Override
    public void sleep() {
        System.out.println("这是student的sleep");
    }
}
