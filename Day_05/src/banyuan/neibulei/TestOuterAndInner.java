package banyuan.neibulei;

public class TestOuterAndInner {
    public static void main(String[] args) {
//       Outer  out=new Outer();
//        out.show();
//        // 外部类名.内部类名  变量名=new 外部类名().new 内部类();
//         Outer.Inner  oi=new Outer().new Inner();
//        System.out.println(oi.address);
//        System.out.println(oi.str);
//        oi.method();
//
//        Outer.Inner   in=out.new Inner();
//
//        System.out.println(in.address);


        Outer   out=new Outer();
        out.showInfo();

        Outer.Inner oi=new Outer.Inner();  //访问内部类的非静态成员的时候才使用这个公式创建对象

        oi.info();

        Outer.Inner.info(); //访问静态内部类的静态成员


        out.getInner3();



    }



}
