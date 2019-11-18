package com.banyuan.jdbc01;

import com.banyuan.jdbc01.pojo.Major;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

    public class Demo3 {

        static List<Major> list=new ArrayList<>();

        public static void main(String[] args) {
            Statement    st=null;
            Connection con=null;
            //连接数据库的地址
            String url="jdbc:mysql://localhost:3306/jian";  // jdbc:mysql://localhost:端口号/数据库名字

            try {
                //1.加载驱动
                Class.forName("com.mysql.jdbc.Driv;\n" +
                        "                //2.获取连接对象\n" +
                        "                con=DriverManager.getConnection(url, \"root\", \"zhou\");\n" +
                        "//            if(con==null){\n" +
                        "//                System.out.println(\"数据库库没连接上\");\n" +
                        "//            }else{\n" +
                        "//                System.out.println(\"数据库连接成功...\");\n" +
                        "//            }\n" +
                        "\n" +
                        "                st=con.createStatement();\n" +
                        "                // String   sql=\"update   major  set  majorname= '312' where majorid=9\";\n" +
                        "                //String  sql=\"delete from  major  where  majorid=2\";\n" +
                        "                String  sql=\"insert  into   major(majorname) values('刘国泰')\";\n" +
                        "\n" +
                        "                //   boolean    flag=st.execute(sql);\n" +
                        "                int   reslut=st.executeUpdate(sql);  //0  表示没有更新成功   1表示更新成功\n" +
                        "                System.out.println(\"------\"+reslut);\n" +
                        "\n" +
                        "                show();\n" +
                        "\n" +
                        "            } catch (Exception e) {\n" +
                        "                e.printStackTrace();\n" +
                        "            }finally {\n" +
                        "                try {er")
                    if(st!=null) {
                        st.close();
                    }
                    if(con!=null){
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }


        }



        //想要用到查询出来的结果 进行其他操作... 进行显示

public  static   void    show(){

    for (Major  s: list) {
        System.out.println(s.toString());
    }


}




}
