package cn.com.lgs.controller;

import cn.com.lgs.domain.User;
import cn.com.lgs.domain.UserList;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @Author luGuoSong
 * @Date 2020/9/4 9:16
 * @Version 1.0
 */
@Controller
public class UserController {
    /*数据响应*/
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
        model.addObject("key","value");
        model.setViewName("success");
        return model;
    }

    /**
     * 直接通过response对象回写数据
     * @param response
     */
    @RequestMapping("/user3")
    public void save3(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("test1");
    }

    /**
     * 使用ResponseBody注解进行数据回写
     * @return
     */
    @RequestMapping("/user4")
    @ResponseBody
    public String save4(){
        return "test2";
    }

    /**
     * 通过jackson将类转换为json字符串返回
     * @return
     * @throws JsonProcessingException
     */
    @RequestMapping("/user5")
    @ResponseBody
    public String save5() throws JsonProcessingException {
        User user=new User();
        user.setName("zhangsan");
        user.setAge(12);
        ObjectMapper objectMapper=new ObjectMapper();
        String string = objectMapper.writeValueAsString(user);
        return string;
    }

    /**
     * 直接返回集合或者对象，需要在springmvc配置文件中进行配置
     * @return
     */
    @RequestMapping("/user6")
    @ResponseBody
    public User save6(){
        User user = new User();
        user.setName("lisi");
        user.setAge(22);
        return user;
    }

    /**
     * 接收基本类型的请求参数
     */
    /*数据请求*/
    @RequestMapping("/user7")
    @ResponseBody
    public void save7(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }

    /**
     *接收POJO数据类型的参数
     * @param user
     */
    @RequestMapping("/user8")
    @ResponseBody
    public void save8(User user){
        System.out.println(user);
    }

    /**
     *接收数组类型的参数
     * @param args
     */
    @RequestMapping("/user9")
    public void save9(String[] args){
        System.out.println(Arrays.asList(args));
    }

    /**
     * 接收普通的集合类型，需要将集合封装成POJO类，然后通过该类作为参数接收集合
     * @param userList
     */
    @RequestMapping("/user10")
    @ResponseBody
    public void save10(UserList userList){
        System.out.println(userList);
    }

    /**
     * 当使用ajax请求，指定contentType为json形式，则可以直接使用集合接收，但参数要加上@RequestBody注解
     * @param userList
     */
    @RequestMapping("/save11")
    @ResponseBody
    public void save11(@RequestBody List<User> userList){
        System.out.println(userList);
    }

}
