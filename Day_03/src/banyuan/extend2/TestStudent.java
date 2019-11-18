package banyuan.extend2;

public class TestStudent {

    public static void main(String[] args) {

        Student  stu=new Student();
        stu.setName("哈哈哈");
        stu.setClassGrold("二年一班");
        stu.setStuNumber(9527);  //用的是父类还是子类的
        stu.setAge(7);
        stu.setIdCard("1324635465786352X");


      //  System.out.println("-----------"+stu.address);

        stu.info();



    }

}
