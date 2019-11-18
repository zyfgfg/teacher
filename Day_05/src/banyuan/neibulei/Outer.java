package banyuan.neibulei;

import com.sun.codemodel.internal.JMethod;

public class Outer {

    /*
        什么叫内部类?
           定义在 类 内部的类
           A 类里面有个 B类
     */
    private static String name="我是外部类的名字";

    protected  static String  address="我是外部类的地址";

  static   String    str="我是外部类的字符串";


    //成员内部类
    public static class  Inner{

       // private  String   name="我是内部类的名字";
       // protected  String   address="我是内部类的地址";
        String   str="我是内部类的字符串";

        public  void   method(){
            System.out.println("我是内部类的method方法:"+name+",address="+address);
        }

        public  static  void  info(){
            System.out.println("内部类的静态方法");
        }

    }

    public  void   show(){
        System.out.println("我是外部类的show方法....");
    }


    //局部内部类
    public  void  showInfo(){
        final int  age=10;  // 内部类里面的局部类的外部属性是被final修饰的  不会随着方法的消失而消失
        class Inner2{
            public   void   method2(){

                System.out.println("我能不能访问外部类的成员..."+address);
                System.out.println(name);
            }

        }
        Inner2  in=new Inner2();
        in.method2();

    }


    //内部类可不可以私有化
    private class   Inner3{


         public void show3(){
             System.out.println("我是私有化内部类的show3方法");
        }

    }


    public    void     getInner3(){


          new  Inner3().show3();
    }





}
