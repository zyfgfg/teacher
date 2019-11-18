package banyuan.duotaiDemo;

public class Animal {

    private  String  name;
    private  int  age;

    public   String address="哈哈哈哈";


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //习性
    public  void   eat(){
        System.out.println("动物吃饭的方式...");
    }
    public  void   sleep(){
        System.out.println("动物睡觉得方式....s");
    }

    public  static  void  method(){
        System.out.println("这是动物的静态方法...");
    }


}
