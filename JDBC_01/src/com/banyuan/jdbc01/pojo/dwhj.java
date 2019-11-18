package com.banyuan.jdbc01.pojo;

import com.sun.codemodel.internal.JStatement;

import java.sql.*;

/**
 *
 */
public class dwhj {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/zhou";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,"root","banyuan");
        Statement sr=con.createStatement();
        String sql="select *from employees";
        ResultSet re=sr.executeQuery(sql);
        while(re.next()){
            System.out.println(re.getInt(1)+" "+re.getString(2)+" "+re.getString(3)+" "+re.getString(4) );
        }






    }
}
