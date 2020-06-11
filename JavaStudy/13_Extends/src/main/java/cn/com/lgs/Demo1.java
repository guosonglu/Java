package cn.com.lgs;

/**
 * @Author luGuoSong
 * @Date 2020/5/9 17:35
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.fun1();
        student1.funFu(); //10
        student1.funZi(); //20
        //重名变量
        student1.funZi2();//30 20 10
    }
}
