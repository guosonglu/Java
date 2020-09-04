package cn.com.lgs.dao.impl;

import cn.com.lgs.dao.UserDao;
import org.springframework.stereotype.Component;

/**
 * @Author luGuoSong
 * @Date 2020/9/3 10:19
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("dao层save方法执行");
    }
}
