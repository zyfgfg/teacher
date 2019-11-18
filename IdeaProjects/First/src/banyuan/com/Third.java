package banyuan.com;

public class Third {
    public static void main(String[] args) {
        int  num=3456; //  %  取余数   /取商   得到的是 百位上的4
        int  result=num/100%10;

        int  a=2;
        int  b;
        a++; //
        ++a;//4
        a = a++ +1;  //
        System.out.println(a++);
        System.out.println(a);

        int x=3;
        int y=4;
        double  dou=12.40+ x++ + ++x+ y++ +x + ++y;
        //求  dou  x    y

        System.out.println(dou);
        int  num1=345;
        int  num2=12;
        int result2=num1%num2;
        num1=num1%num2;
        num1%=num2;

        //  <  >  <=  >=   !=  ==   得到的结果一定是布尔类型

        System.out.println(3!=2);
        System.out.println(3==2);

        // ==  =

        //逻辑运算符  &   &&     |    ||    !   ^
        /*   & 左右两边的表达式   如果左边成立   右边表达式继续执行   如果左边不成立  右边还是执行
             &&    左边如果不成立 右边不执行   如果左边成立   右边才会执行
             |   左边不成立  右边执行     如果  左边成立  右边执行
             ||  左边成立  右边不执行    左边不成立  右边执行

         */
        a=5;
        b=3;
        System.out.println( (++a<b)^(b++ >a) );
        System.out.println( "a="+a+",b="+b);




    }
}
