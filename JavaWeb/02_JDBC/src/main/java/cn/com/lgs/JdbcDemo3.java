package cn.com.lgs;

import cn.com.lgs.util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author luGuoSong
 * @Date 2020/8/27 17:35
 * @Version 1.0
 * 使用Jdbc工具类操作数据库
 */
public class JdbcDemo3 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from user");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + "---" + resultSet.getString(2) + "---" + resultSet.getString(3));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(connection,statement,resultSet);
        }

    }
}
