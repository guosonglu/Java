package cn.com.lgs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author luGuoSong
 * @Date 2020/9/4 9:16
 * @Version 1.0
 */
@Controller
public class UserController {

    @RequestMapping("/user")
    public String save(){
        System.out.println("Controller执行");
        return "success.jsp";
    }
}
