package cn.com.upda;

/**
 * @Author luGuoSong
 * @Date 2020/7/6 9:50
 * @Version 1.0
 */
public interface MyInterface {
    //常量
    public static final int NUM=10;

    //这是一个抽象方法,public abstract可以省略
    public abstract void method1();

    //JAVA8开始支持默认方法
    public default void method2(){
        System.out.println("我是默认方法");
    };

    //JAVA8开始支持静态方法
    public static void method3(){
        System.out.println("我是静态方法");
    }

    //JAVA9开始支持静态方法，这里用的8，不展示了
}
