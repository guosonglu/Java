package cn.com.lgs.controller;

import cn.com.lgs.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author luGuoSong
 * @Date 2020/8/24 11:10
 * @Version 1.0
 * 模拟controller
 */
public class UserController {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
        userService.save();
    }
}
