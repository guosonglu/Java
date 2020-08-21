package cn.com.lgs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @Author luGuoSong
 * @Date 2020/8/20 14:33
 * @Version 1.0
 * JDBC快速入门
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
        //注册驱动org.mariadb.jdbc.Driver
        Class.forName("org.mariadb.jdbc.Driver");
        //获得数据库连接对象
        Connection connection = DriverManager.getConnection("jdbc:mariadb://192.168.178.130:3306/db1", "root", "lgs1993927");
        //定义sql语句
        String sql="select * from user";
        //获取执行
        Statement statement = connection.createStatement();
        //执行sql
        ResultSet resultSet = statement.executeQuery(sql);
        //处理结果
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        //释放资源
        statement.close();
        connection.close();
    }
}
