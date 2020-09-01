package cn.com.lgs.ioc;

/**
 * @Author luGuoSong
 * @Date 2020/7/7 9:37
 * @Version 1.0
 */
public class Zi extends Fu{
    int num=20;

    @Override
    public void method() {
        System.out.println("方法子");
    }

    //这个方法声明父类变量无法调用
    public void methodZi(){
        System.out.println("子类特有方法");
    }
}
