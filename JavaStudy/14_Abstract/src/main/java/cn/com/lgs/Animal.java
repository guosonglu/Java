package cn.com.lgs;

/**
 * @Author luGuoSong
 * @Date 2020/6/29 10:39
 * @Version 1.0
 */
/*抽象方法必须在抽象类中*/
public abstract class Animal {
    public Animal(){
        System.out.println("父类构造执行");
    }

    //抽象方法
    public abstract void eat();
}
