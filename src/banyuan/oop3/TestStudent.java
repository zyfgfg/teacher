package banyuan.oop3;
import banyuan.oop2.Student;//如果要引用其他包下面的类里面的方法或者属性  得 导入相关的包名.类名
public class TestStudent {

    public static void main(String[] args) {

        Student  stu=new Student();
        stu.setName("张三");
        stu.setAge(34);

        //只调用一次stu里面的duogongneng()方法
        stu.duogongneng(); //当这个对象 stu 不在被使用的时候   你觉得它还存不存在内存中？
        //  不存在  为什么不存在   java 的 有两大机制  1.虚拟机   2.垃圾回收（自动回收）
        stu=null; //stu指向为空
        Student stu2=new Student();

        stu.setName("你好");  //java.lang.NullPointerException
        System.out.println(stu.getName());




    }

}
