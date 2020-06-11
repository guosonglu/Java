package cn.com.lgs;

/**
 * @Author luGuoSong
 * @Date 2020/5/9 17:32
 * @Version 1.0
 */
public class Student extends Person {

    private int age=20;

    @Override
    public void fun1() {
        System.out.println("我是一个学生");
    }

    public void funZi(){
        System.out.println(age);
    }

    //变量重名情况
    public void funZi2(){
        int age=30;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }
}
