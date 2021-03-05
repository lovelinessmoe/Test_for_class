package com.imnu.JDBC;

import java.sql.*;

public class JDBC_Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1注册驱动
        //新版本sql驱动加上cj不报错
        Class.forName("com.mysql.cj.jdbc.Driver");
        ///Users/loveliness/IdeaProjects/Test_for_class/lib/mysql-connector-java-8.0.22.jar!/com/mysql/jdbc/Driver.class
        //2链接数据库
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "CAOshunmiao");
        ///////////////////////////


        //字符串 sql 语句
        String sql_update = "insert into accont values (1,'王富贵')";
        //3预处理 字符串转换为 sql语句
        PreparedStatement pstm_update = conn.prepareStatement(sql_update);
        //update 数据库发生改变操作
        //for(int i=0;i<1000;i++){
        int rs_update = pstm_update.executeUpdate();
        if (rs_update > 0) {
            System.out.println("插入成功");
        } else {
            System.out.println("插入失败");
            //  }
        }
        pstm_update.close();


        ///////////////////////////
        String sql = "select count(*) from ";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, "狗蛋");
        //把第一个出现的？变成狗蛋
        int rs = pstm.executeUpdate();
        if (rs > 0) {
            System.out.println("狗蛋插入成功");
        }
        pstm.close();


        ///////////////////////////
        String sql_query = "select count(*) from accont";
        //query 查询操作
        PreparedStatement pstm_query = conn.prepareStatement(sql_query);
        //释放查询出来的结果集
        ResultSet rs_query = pstm_query.executeQuery();
        while (rs_query.next()) {
//            System.out.println(rs_query.getString("name"));
            System.out.println(rs_query.getInt(1));
        }
        rs_query.close();
        //5关闭数据库链接
        conn.close();
    }
}
