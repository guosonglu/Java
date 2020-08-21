package cn.com.lgs.factory;

import cn.com.lgs.dao.Impl.UserDaoImpl;
import cn.com.lgs.dao.UserDao;

/**
 * @Author luGuoSong
 * @Date 2020/8/21 16:09
 * @Version 1.0
 */
public class UserDaoFactory {
    //静态方法
    public static UserDao getUserDao1(){
        System.out.println("工厂静态方法执行");
        return new UserDaoImpl();
    }

    //非静态方法
    public  UserDao getUserDao2(){
        System.out.println("工厂非静态方法执行");
        return new UserDaoImpl();
    }
}
