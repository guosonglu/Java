package cn.com.lgs.aop.proxy.cglib;

/**
 * @Author luGuoSong
 * @Date 2020/9/1 10:48
 * @Version 1.0
 */
public class Target{
    public void save() {
        System.out.println("目标方法执行");
    }
}
