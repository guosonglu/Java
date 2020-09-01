package cn.com.lgs.ioc.daodemo;

import cn.com.lgs.ioc.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author luGuoSong
 * @Date 2020/8/21 11:15
 * @Version 1.0
 */
public class UserDaoDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }
}
