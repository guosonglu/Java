package cn.com.lgs.dao.Impl;

import cn.com.lgs.dao.UserDao;

/**
 * @Author luGuoSong
 * @Date 2020/8/21 10:51
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {
    /**
     * 普通属性依赖注入
     */
    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public UserDaoImpl(){
        System.out.println("对象被创建了");
    }

    public void save() {
        System.out.println("Save runing......");
    }

    public void init() {
        System.out.println("初始化方法执行");
    }

    public void destory() {
        System.out.println("销毁方法执行");
    }
}