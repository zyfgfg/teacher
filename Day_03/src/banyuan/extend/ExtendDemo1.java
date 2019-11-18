package banyuan.extend;

public class ExtendDemo1 {

    public static void main(String[] args) {
        //Father  f=new Father("张三",45,'男',1.78,"125263745412352");
        //Son  s=new Son("张四",23,'男',1.84,"15263512452312321X");
       // Father   f=new Father();
        Son  s=new Son();
        s.setFname("沾上干");
        s.setAge(23);
        s.setHeight(1.89);
        s.setSex('男');
        s.setIdCard("1232543654758634524");
        System.out.println(s.toString()+"----"+s.address);
        s.paoniu();

        s.study();
        s.work();
        s.mokeMoney();


    }

}
