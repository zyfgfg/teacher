package banyuan.oop1;

public class Person {
    String  name;//姓名
    String  address;//地址   String  类型的 数据在类里面的默认值是  null
    int age=0;//年龄
    double  height;// 身高
    double  weight;//体重
    String  appearance; //外貌
    String  IdCard;
    char  sex;

    public  void   sing(){
        System.out.println("我能唱");
    }
    public void   eat(){
        System.out.println("我能吃");
    }
    public  void   rap(String name){
        //String  name="运营";

        System.out.println(name+"能跳舞");
    }







}
