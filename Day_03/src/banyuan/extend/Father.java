package banyuan.extend;

public class Father {

    private  String  fname;
    private  int  age;
    private   char sex;
    private   double  height;//  身高
    private   String   IdCard;//身份证号

    public   String   address="下水道";

    public Father(String fname, int age, char sex, double height, String idCard) {
        this.fname = fname;
        this.age = age;
        this.sex = sex;
        this.height = height;
        IdCard = idCard;
    }

    public Father() {
        System.out.println("我是father的无参构造...");
    }

    @Override
    public String toString() {
        return "Father{" +
                "fname='" + fname + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", height=" + height +
                ", IdCard='" + IdCard + '\'' +
                '}';
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String idCard) {
        IdCard = idCard;
    }

    //老子特有的行为
    private  void  method(){
        System.out.println("老子可以买房子");
    }


    public  void  mokeMoney(){
        System.out.println("老子可以赚钱...");
    }

    public   void   work(){
        System.out.println("老子在工作");
    }

    public   void   study(){
        System.out.println("老子在学习");
    }






}
