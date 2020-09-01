package cn.com.lgs.ioc;

/**
 * @Author luGuoSong
 * @Date 2020/7/9 15:42
 * @Version 1.0
 */
public class People {
    private String name;
    private int age;

    //重写Object类的toString方法
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public People() {
    }


    public People(String name, int age) {
        this.name = name;
        this.age = age;
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
