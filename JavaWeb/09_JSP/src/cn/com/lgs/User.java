package cn.com.lgs;

import java.util.Date;

/**
 * @Author luGuoSong
 * @Date 2020/8/17 16:27
 * @Version 1.0
 */
public class User {
    private String name;
    private int age;
    private Date date;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
