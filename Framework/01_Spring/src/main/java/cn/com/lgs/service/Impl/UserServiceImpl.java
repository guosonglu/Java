package cn.com.lgs.service.Impl;

import cn.com.lgs.dao.UserDao;
import cn.com.lgs.domain.User;
import cn.com.lgs.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @Author luGuoSong
 * @Date 2020/8/24 10:49
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //根据构造方法
    @SuppressWarnings("AlibabaCommentsMustBeJavadocFormat")
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    //使用set方法进行依赖注入
    @SuppressWarnings("AlibabaCommentsMustBeJavadocFormat")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //集合注入
    @SuppressWarnings("AlibabaCommentsMustBeJavadocFormat")
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
        //使用依赖注入
        userDao.save();
        //打印集合
        System.out.println(list);
        System.out.println(users);
        System.out.println(properties);
    }
}
