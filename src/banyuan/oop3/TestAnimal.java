package banyuan.oop3;

public class TestAnimal {

    public static void main(String[] args) {

        Animal  an=new Animal();
        //这个animal对象是机器根据什么来创建？
        //构造函数   构造方法  构造器  用来创建对象
        an.setName("dog");
        an.setColor("黄色");
        an.setAge(5); //无参构造器赋值方式

        //通过有参构造器去创建对象
        an=new Animal("猫","color kind of all ",4);
        System.out.println(an.toString());

        an =new Animal("长颈鹿","hbw");

        //在创建对象的同时给对象的name赋值

        //如果 该类里面只有一个有参构造器  那么请问  创建对象的时候能不能使用无参构造器来创建
       /*
        当一个类里面有有参构造器的时候 没有无参构造器 那么机器不在会为该类提供无参构造

        */


    }

}
