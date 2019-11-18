package banyuan.oop1;

public class TestPerson2 {
    public static void main(String[] args) {
        Person2  per=new Person2();
       // per.age=-10;
        per.setAge(-10);
        per.eat();
        per.setName("张三");
        per.setAddress("下水道");
        //把这个对象的属性信息在控制台输出
       // System.out.println("我叫:"+per.getName()+",今年"+per.getAge()+",住在"+per.getAddress());
        System.out.println(per.showInfo());


        Person2  per2=new Person2();
        // per.age=-10;
        per2.setAge(20);
        per2.eat();
        per2.setName("张三");
        per2.setAddress("下水道");
        //把这个对象的属性信息在控制台输出
       // System.out.println("我叫:"+per2.getName()+",今年"+per2.getAge()+",住在"+per2.getAddress());
        System.out.println(per2.showInfo());

        Person2  per3=new Person2();
        // per.age=-10;
        per3.setAge(-10);
        per3.eat();
        per3.setName("张三");
        per3.setAddress("下水道");
        //把这个对象的属性信息在控制台输出
        System.out.println("我叫:"+per3.getName()+",今年"+per3.getAge()+",住在"+per3.getAddress());





    }
}
