package cn.com.lgs.ioc;

/**
 * @Author luGuoSong
 * @Date 2020/5/9 11:07
 * @Version 1.0
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private static int num=0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        id=++num;
    }

    static {
        System.out.println("静态代码块执行了");
    }

    public void fun1(){
        System.out.println("非静态方法"+age);
    }

    public static void fun2(){
        System.out.println("静态方法"+num);  //静态方法不能访问非静态变量，只能访问静态变量
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
