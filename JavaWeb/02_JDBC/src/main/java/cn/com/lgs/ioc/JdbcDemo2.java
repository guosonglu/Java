package cn.com.lgs.ioc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author luGuoSong
 * @Date 2020/8/27 11:05
 * @Version 1.0
 */
public class JdbcDemo2 {
    public static void main(String[] args) {
        Statement statement=null;
        Connection connection=null;
        try {
            //注册驱动
            Class.forName("org.mariadb.jdbc.Driver");
            //获得connection对象
             connection = DriverManager.getConnection("jdbc:mariadb://192.168.178.130:3306/db1", "root", "lgs1993927");
            //获得sql执行对象
             statement = connection.createStatement();
            //执行sql
            System.out.println(statement.executeUpdate("insert into user values (null,'王六',25)"));
        }  catch (Exception throwables) {
            throwables.printStackTrace();
        }finally {
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }


        }
    }
}
