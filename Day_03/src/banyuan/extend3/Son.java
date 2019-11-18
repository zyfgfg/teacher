package banyuan.extend3;

public class Son extends  Person {


    private  String  name="山炮";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    //你们也可以赚钱了  但是  你们赚钱的方式不一样

    public  void  makeMoney(String  name){
        System.out.println(name+"在写代码赚钱");
    }

    private void  method(){
        System.out.println("我是子类的私有化方法");
    }

    public   void  method2(){
        System.out.println("我是子类的默认方法");
    }

    public Son(String name, int age) {
        super(name,age); //表示访问父类的有参构造方法
    }

    public Son() {
      // super();
       // System.out.println("");
        this("平头哥",4);//访问的是自己的有参构造函数

    }





    public Son(String name1) {
       // super(name, age);
        this.name = name1;
        System.out.println("子类有参构造...");
    }

    public  void showInfo(){
        System.out.println("名字叫:"+super.getName()+",----"+this.getName());
    }



}
