package cn.com.lgs;

/**
 * @Author luGuoSong
 * @Date 2020/7/14 15:53
 * @Version 1.0
 * TreeSet自然排序
 */
public class Student implements Comparable<Student>{
    private String name;
    private  int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

    @Override
    public int compareTo(Student s) {
        int num=this.age-s.age;
        int num2= num==0?this.name.compareTo(s.name):num;
        return num2;
    }
}
