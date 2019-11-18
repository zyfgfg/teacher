package banyuan.com.itcom;

public class Second {

    public static void main(String[] args) {

               int  num=19;
               int  number;//变量名再使用的时候要被赋值  也就是初始化
               // System.out.println(num+"----"+number);
            float  fl=12.891251413f;  //一般情况下 float保存小数点后面6位
            System.out.println(fl);
            double dou=123.412325436547612312D;
        System.out.println(dou);

            long lon=12311412L;//因为整数默认是int类型 所以long后面要加  L

            //byte  short int  long   float  double
            byte   b=24; //127
            short  s=12;
              b=54; //超过取值范围
        //注意   类似于  byte   short  char  这三个 如果和  整数（int） 进行操作
            // 那么会产生一种结果：小的数据类型会变成大的数据类型然后再参与运算 隐式类型转换
            // 大的数据类型转换成小的数据类型   叫强制类型转换
            byte  c=21;
            byte sum=(byte)(b+c);//b 本身是byte 然后转换成 int
            char  x='a';
        System.out.println("a="+(char)(x+2));
        System.out.println("结果是:"+sum);


        System.out.println(b+"--"+s); //问题:  这里的  24  12 结果的类型有没有变

        float  f1=12.34221312f;
        float  f2=34.563421141312f;
        double  f3=f1+f2;
        System.out.println(f1+f2);//输出的结果是什么类型
        System.out.println(f3);

        short  sh=12;    //
        sh+=1;  // sh=(short)(sh+1);
        System.out.println(sh);

        short  st=12;
        //st=st+3;
        System.out.println(st);

//            byte b1=3,b2=4,c;
//            c=b1+b2;
//            c=3+4;
        byte  t=(byte)129;
        System.out.println(t);

        String    str="你好";
        System.out.println(str+'a'+1);
        System.out.println((char)('z'+141)+str);

        System.out.println(5+5+"5+5"+5+5);//5+555   字符串跟任何类型的数据进行拼接  最终的结果都是字符串类型

        char  n='\u1001';
        System.out.println(n);
        boolean flag=true; //经常用于做判断







    }

}
