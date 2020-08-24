package cn.com.lgs.service.Impl;

import cn.com.lgs.dao.UserDao;
import cn.com.lgs.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author luGuoSong
 * @Date 2020/8/24 10:49
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        //如果不使用依赖注入，想调用UserDao，需要使用ClassPathXmlApplicationContext加载配置文件
        //ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserDao userDao = (UserDao) classPathXmlApplicationContext.getBean("userDao");
        //userDao.save();
        //使用依赖注入
        userDao.save();
    }
}
