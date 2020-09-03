package cn.com.lgs;

import cn.com.lgs.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author luGuoSong
 * @Date 2020/8/28 10:09
 * @Version 1.0
 * 事务操作
 */
public class JdbcDemo5 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement2 = null;
        try {
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement("update user set age = age + ? where name = ?");
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "张三");
            preparedStatement2 = connection.prepareStatement("update user set age = age - ? where name = ?");
            preparedStatement2.setInt(1, 1);
            preparedStatement2.setString(2, "李四");
            preparedStatement.executeUpdate();
            int a=3/0;
            preparedStatement2.executeUpdate();
            connection.commit();
        } catch (Exception throwables) {
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(connection, preparedStatement, null);
            JDBCUtils.close(connection, preparedStatement2, null);
        }
    }
}
