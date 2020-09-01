package cn.com.lgs.ioc;

/**
 * @Author luGuoSong
 * @Date 2020/5/9 17:35
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.fun1();
        student1.funZi();
        student1.funFu();
        student1.funZi2();//30 20 10
    }
}
