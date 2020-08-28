package cn.com.lgs;

import cn.com.lgs.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author luGuoSong
 * @Date 2020/8/28 9:30
 * @Version 1.0
 * PrepareStatement使用
 */
public class JdbcDemo4 {
    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection= JDBCUtils.getConnection();
            preparedStatement= connection.prepareStatement("select * from user where id=?");
            preparedStatement.setInt(1,2);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getString(2));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(connection,preparedStatement,null);
        }
    }
}
