package banyuan.oop1;

public class Person2 { //一个类的基本结构如下   属性+方法的集合

    private String  name;
    private String  address;
    private int age=10;

    //被private  修饰的  不能被其他的类直接访问  只在本类中起作用

    public void  eat(){
        System.out.println(name+"在吃饭,今年"+age+"岁");
    }

    //类里面提供了一个公有化的方法方便其他的类来访问
    public  void   setAge(int  age){
        if(age>0&&age<150){
            this.age=age; //this 表示当前对象
        }else{
            System.out.println("您输入的年龄不符合条件,请重新输入...");
        }
    }
    public int  getAge(){
        return this.age; //获取对象属性的时候 this可以省略
    }


    public  void setName(String  newName){
        if(newName!=null){
            name=newName;
        }
    }
    public  String  getName(){
        return   name;
    }

    public  void   setAddress(String  newAddress){
        if(newAddress!=null){
            address=newAddress;
        }
    }
    public  String  getAddress(){
        return  address;
    }

    //提供一个公共的方法 用来返回一个对象基本信息
    public String  showInfo(){
        return "我叫:"+this.getName()+",今年"+this.getAge()+",住在"+this.getAddress();
    }


}
