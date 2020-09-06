package cn.com.lgs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author luGuoSong
 * @Date 2020/9/4 9:16
 * @Version 1.0
 */
@Controller
public class UserController {


    /**
     * 直接返回字符串进行页面跳转
     * @return 跳转地址
     */
    @RequestMapping("/user")
    public String save(){
        System.out.println("Controller执行");
        return "success";
    }

    /**
     * 返回ModelAndView进行页面跳转
     * @param model
     * @return
     */
    @RequestMapping("/user2")
    public ModelAndView save2(ModelAndView model){
        model.setViewName("success");
        return model;
    }


}
