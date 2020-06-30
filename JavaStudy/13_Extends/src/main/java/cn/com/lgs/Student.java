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
        System.out.println("fun1");
        System.out.println("我是一个学生");
    }

    public void funZi() {
        System.out.println("funZi");
        super.fun1();
    }
    //变量重名情况
    public void funZi2(){
        System.out.println("funZi2");
        System.out.println("同名变量处理");
        int age=30;
        System.out.println("局部变量："+age);
        System.out.println("子类变量"+this.age);
        System.out.println("父类变量"+super.age);
    }
}
