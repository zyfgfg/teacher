package banyuan.extend2;

public class Student extends  Person {

    //public   String  address="仙林小学";
    private int  stuNumber;//学生编号
    private String  classGrold;//班级


    public   void   info(){
      //  String   address="仙林幼儿园";
        System.out.println(address);
    }




    public Student() {
        super();
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
        System.out.println("这是子类的...stuNumber");
    }

    public String getClassGrold() {
        return classGrold;
    }

    public void setClassGrold(String classGrold) {
        this.classGrold = classGrold;
    }

    public Student(int stuNumber, String classGrold) {
        super();
        this.stuNumber = stuNumber;
        this.classGrold = classGrold;
    }

    public   void   test(){
        System.out.println("进行测试");
    }
    public  void   show(){
        System.out.println("学号是:"+stuNumber);
    }



}
