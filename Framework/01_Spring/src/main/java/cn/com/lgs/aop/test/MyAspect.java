package cn.com.lgs.aop.test;

/**
 * @Author luGuoSong
 * @Date 2020/9/1 14:15
 * @Version 1.0
 * 切面类
 */
public class MyAspect {
    public void before(){
        System.out.println("前置增强");
    }

    public void after(){
        System.out.println("后置增强");
    }
}
