package cn.com.lgs;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author luGuoSong
 * @Date 2020/8/28 14:43
 * @Version 1.0
 * 使用c3p0连接池
 */
public class JdbcDemo6 {
    public static void main(String[] args) {
        Connection connection=null;
        try {
            //创建连接池对象
            DataSource dataSource = new ComboPooledDataSource();
            //获取连接
            connection= dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
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
