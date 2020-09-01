package cn.com.lgs.aop.proxy.cglib;

/**
 * @Author luGuoSong
 * @Date 2020/9/1 10:49
 * @Version 1.0
 */
public class Advice {

    public void before() {
        System.out.println("之前执行。。。");
    }
    
    public void after() {
        System.out.println("之后执行。。。");
    }
}
