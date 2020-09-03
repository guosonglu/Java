package cn.com.lgs;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;

/**
 * @Author luGuoSong
 * @Date 2020/8/28 15:53
 * @Version 1.0
 * 使用druid连接池
 */
public class JdbcDemo7 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(JdbcDemo7.class.getClassLoader().getResourceAsStream("druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
