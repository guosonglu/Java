package cn.com.lgs;

/**
 * @Author luGuoSong
 * @Date 2020/6/29 11:01
 * @Version 1.0
 */
public class Cat extends Animal{
    public Cat(){
        System.out.println("子类构造执行");
    }

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }
}
