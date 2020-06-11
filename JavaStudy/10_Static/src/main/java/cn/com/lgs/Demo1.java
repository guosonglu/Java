package cn.com.lgs;

/**
 * @Author luGuoSong
 * @Date 2020/5/9 10:34
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        Student std1=new Student("张三",18);
        Student std2=new Student("李四",22);
        System.out.println("张三ID："+std1.getId());
        System.out.println("李四ID："+std2.getId());
        //普通方法需要通过对象调用
        std1.fun1();
        //静态方法既可以用对象调用，也可以用类名称调用
        Student.fun2();  //推荐
        std1.fun2();  //不推荐,容易误以为是普通成员方法
    }
}
