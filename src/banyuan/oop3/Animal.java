package banyuan.oop3;

public class Animal {

    private  String name;//动物名字
    private  String color;//毛发颜色
    private  int  age;//动物年龄
    /*
        public   类名(){

        }
        有些类里面没有一个构造函数  但是依然能创建该类的对象  为什么？以为机器默认提供了一个构造器(无参构造器)

        public  类名(属性1,属性2,属性3,...){
            this.属性1=属性1；
            this.属性2=属性2；
            this.属性3=属性3；
        }


     */
   public   Animal(){
        System.out.println("你猜我有没有执行....");
        this.name="李四";
    }



    public   Animal(String  name,String color,int age){
       // System.out.println("能不能加代码");

        this.name=name;
        this.color=color;
        this.age=age;
       // System.out.println("能不能在任意位置加代码");
    }

    public  Animal(String name,String color){
        this.name=name;
        this.color=color;

    }

    public  Animal(String  color){
        this.color=color;
    }
    public Animal(String  name,int  age){
        this.name=name;
        this.age=age;
    }

    /*
       方法重载:   方法名一样,但是参数列表不一样,跟返回值的类型没有关系


     */

    public   void   method1(){

    }
    public  String  method1(String  name,int age){
        return  "";
    }

    public  int  method1(int age,String name){
        return  0;
    }








    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //动物的习性
    public  void  eat(String food){
        System.out.println(name+"喜欢吃"+food);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
