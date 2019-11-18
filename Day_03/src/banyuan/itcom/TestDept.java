package banyuan.itcom;

public class TestDept {

    public static void main(String[] args) {
        //
        Dept  dept=new  Dept();
        dept.setDeptno(001);
        dept.setDname("人事部");
        dept.setdLocal("栖霞区紫东创意园B9栋");

        Dept dept2=new Dept();

        dept2.setDeptno(002);
        dept2.setDname("教学部");
        dept2.setdLocal("栖霞区紫东创意园B9栋");


        Dept dept3=new Dept();
        dept3.setDeptno(003);
        dept3.setDname("研发部");
        dept3.setdLocal("栖霞区紫东创意园B9栋");


        Employ  em=new Employ(9527,"周星星","HongKong","13256542","人事部");
        Employ  em2=new Employ(7369,"达叔","HongKong","144456542","教学部");
        Employ  em3=new Employ(4532,"陈法蓉","HongKong","133356542","研发部");
        em.setDept(dept);
        em2.setDept(dept2);
        em3.setDept(dept3); //

        System.out.println("---"+em.toString());


//        dept.setEmp(new Employ[]{em,em2,em3});
//
//        dept2.setEmp(new Employ[]{em,em3});
//
//        dept3.setEmp(new Employ[]{em2,em3});
//
//        System.out.println(dept.toString());

        //我是老板  我到一个人    我只知道他的名字   但是我不知道他是哪个部门的  现在1. 在各个部门里面去一个的查
        //2.找到这个员工的上司 问
        //有三个一样名字的人









    }

}
