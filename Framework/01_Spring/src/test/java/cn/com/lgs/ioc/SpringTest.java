package cn.com.lgs.ioc;

import cn.com.lgs.ioc.dao.UserDao;
import cn.com.lgs.ioc.config.BeanConfig;
import cn.com.lgs.ioc.dao.StudentDao;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author luGuoSong
 * @Date 2020/8/21 14:21
 * @Version 1.0
 */
public class SpringTest {
    @Test
    //测试scope属性
    public void test1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) applicationContext.getBean("userDao");
        Object userDao2 = applicationContext.getBean("userDao");
        System.out.println(userDao1);
        System.out.println(userDao2);
        System.out.println(userDao1.getUserName());
        //通过工厂静态方法获取对象
        Object userDao21 = applicationContext.getBean("userDao2");
        System.out.println(userDao21);
        //通过工厂非静态方法获得对象
        Object userDao3 = applicationContext.getBean("userDao3");
        System.out.println(userDao3);
    }


    //Spring配置文件配置数据源
    @Test
    public void test2() throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    //测试使用类配置Spring
    @Test
    public void test3(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        StudentDao student = (StudentDao) context.getBean("Student");
        student.save();
    }
}
