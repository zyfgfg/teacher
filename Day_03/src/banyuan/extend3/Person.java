package banyuan.extend3;

public class Person {

    private  String  name="蚂蚁";
    private  int  age=2;

    public Person() {
        super();
        System.out.println("我是父类无参构造器....");
    }
        
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类的有参构造....");
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public   void   makeMoney(String  name){
        System.out.println(name+"person包工程在赚钱");

    }

    private  void   method(){
        System.out.println("我是父类的的私有化方法");
    }

    public  void   method2(){
        System.out.println("我是父类默认的方法");
    }







}
