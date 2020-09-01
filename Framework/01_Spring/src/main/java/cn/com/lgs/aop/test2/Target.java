package cn.com.lgs.aop.test2;

import org.springframework.stereotype.Component;

/**
 * @Author luGuoSong
 * @Date 2020/9/1 10:48
 * @Version 1.0
 * 目标类
 */
@Component("target")
public class Target implements TargetInterface {
    public void save() {
        System.out.println("目标方法执行");
    }

    public void save2() {
        System.out.println("目标方法执行2");
    }
}
