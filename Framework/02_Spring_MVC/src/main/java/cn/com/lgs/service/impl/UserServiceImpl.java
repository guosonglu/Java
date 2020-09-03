package cn.com.lgs.service.impl;

import cn.com.lgs.dao.UserDao;
import cn.com.lgs.service.UserService;

/**
 * @Author luGuoSong
 * @Date 2020/9/3 11:26
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
