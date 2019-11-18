package banyuan.com;

public class Person {
    private  String  name;
    private  String  age;
    private  String  address;

    public  static  String  country="中国";


    public   static    int   getShow(){
        // this.setCountry("中国");  不能这么写
        System.out.println("我是被共享的方法");
        return 0;
    }


    {
        System.out.println("构造代码块");
    }

    public  static  void   info(){
        //System.out.println("访问非静态的:"+name); //静态的不能访问非静态
        System.out.println("我是"+country+"人");
        //getInfo();

    }
    public  void  getInfo(){
        System.out.println("我是"+country+"人");


    }






    //static 把数据共享

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Person() {
       // System.out.println("构造代快");   编译之后 结构
        System.out.println("我是无参构造方法代码块");
    }

    public Person(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    static {  //静态代码块     一般情况下： 写一些数据库的连接步骤
        System.out.println("静态代码块...");
    }

}
