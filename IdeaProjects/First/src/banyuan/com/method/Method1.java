package banyuan.com.method;

/**
 * @deprecated   hahahahha
 *
 */
public class Method1 {

    public static void main(String[] args) {
        //方法出现的位置在类里面  其他的方法外面
        /*
            修饰符  static  返回类型  方法名(参数...){

            }
         */

        method1();
        method2(4);
         method3(45);

        System.out.println(method4(45,65,"还有谁"));

    }

    public  static   void  method1(){
        System.out.println("我是没有参数的方法");
    }

    public  static   void   method2(int  num){
        System.out.println("我是有一个参数的方法,传递过来的值是:"+num);
    }


    /**
     * @param num  用来接收 数值类型
     * @return 返回得的相加结果
     * @deprecated  你猜我是干嘛的
     */
    public  static   int   method3(int  num){

       // System.out.println("我是有一个参数的方法,传递过来的值是:"+num);
        return num+4;
    }


    public  static   String   method4(int  num,int num2,String str){
       // System.out.println("我是有一个参数的方法,传递过来的值是:"+num);

        return  num+num2+str;

    }



}
