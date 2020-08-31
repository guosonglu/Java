package cn.com.lgs.dao.Impl;

import cn.com.lgs.dao.Student;

/**
 * @Author luGuoSong
 * @Date 2020/8/31 14:47
 * @Version 1.0
 * 使用注解开发
 */
public class StudentImpl implements Student {
    public void save() {
        System.out.println("Dao层方法执行");
    }
}
