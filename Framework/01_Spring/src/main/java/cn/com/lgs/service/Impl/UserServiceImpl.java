package cn.com.lgs.service.Impl;

import cn.com.lgs.dao.UserDao;
import cn.com.lgs.domain.User;
import cn.com.lgs.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @Author luGuoSong
 * @Date 2020/8/24 10:49
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //根据构造方法
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    //使用set方法进行依赖注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //集合注入
    private List list;
    private Map<String, User> users;
    private Properties properties;

    public void setList(List list) {
        this.list = list;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void save() {
        //如果不使用依赖注入，想调用UserDao，需要使用ClassPathXmlApplicationContext加载配置文件
        //ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserDao userDao = (UserDao) classPathXmlApplicationContext.getBean("userDao");
        //userDao.save();
        //使用依赖注入
        userDao.save();
        //打印集合
        System.out.println(list);
        System.out.println(users);
        System.out.println(properties);
    }
}
