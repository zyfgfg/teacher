package com.banyuan.jdbc01;

import com.banyuan.jdbc01.pojo.Major;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Demo2 {

    static List<Major> list=new ArrayList<>();

    public static void main(String[] args) {
    //连接数据库的地址
        String url="jdbc:mysql://localhost:3306/zhou";  // jdbc:mysql://localhost:端口号/数据库名字

        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接对象
            Connection con=DriverManager.getConnection(url, "root", "banyuan");

            Statement    st=con.createStatement();
            String   sql="select * from employees";

            ResultSet rs=st.executeQuery(sql);  //执行sql语句
//
//            System.out.println(rs.next());
        while(rs.next()){
//            System.out.println(rs.getInt(1)+"="+rs.getString(2));
//            System.out.println(rs.getString("employee_id")+"----"+rs.getString("job_id"));
            int  marjorid=rs.getInt("employee_id");
            String  majorname=rs.getString("job_id");
            Major  ma=new Major(marjorid, majorname);

            list.add(ma);

        }
        show();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }



    //想要用到查询出来的结果 进行其他操作... 进行显示

public  static   void    show(){

    for (Major  s: list) {
        System.out.println(s.toString());
    }


}




}
