package banyuan.oop1;

public class TestOop {

    public static void main(String[] args) {
        //让张伟  去表演才艺
        // 张伟来了
        Oop1  op=new   Oop1();//创建一个对象    类名   变量名(对象名)=new   类名();
        //  对象名.属性    如果要调用行为 对象名.方法名
        op.name="刘国泰";
        op.age=45;
        op.height=2.8;
        op.weight=1000;
        op.address="xxxxxx";
        op.IdCard="xxxyyyxxyyyzzzasdawd";

        System.out.println("我叫:"+op.name);
        op.rap();

        Oop1 ch=new Oop1();
        ch.name="陈浩";
        ch.age=23;

        System.out.println("my  name is"+ch.name);
                ch.eat();
           Oop1 o=new Oop1();
        System.out.println(o.name);



    }
}
