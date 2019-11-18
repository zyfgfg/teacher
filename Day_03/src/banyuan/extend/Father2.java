package banyuan.extend;

public class Father2 {

    private  String  fname;
    private  int  age;
    private   char sex;
    private   double  height;//  身高
    private   String   IdCard;//身份证号

    public   String   address="下水道";

    public Father2(String fname, int age, char sex, double height, String idCard) {
        this.fname = fname;
        this.age = age;
        this.sex = sex;
        this.height = height;
        IdCard = idCard;
    }

    public Father2() {
        System.out.println("father...构造方法");
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



}
