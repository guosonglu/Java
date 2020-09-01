package cn.com.lgs.aop.test2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author luGuoSong
 * @Date 2020/9/1 14:15
 * @Version 1.0
 * 切面类
 */
@Component("myAspect")
@Aspect
public class MyAspect {
    @Before("execution(* cn.com.lgs.aop.test2..*.*(..))")
    public void before(){
        System.out.println("前置增强");
    }

    public void after(){
        System.out.println("后置增强");
    }
}
