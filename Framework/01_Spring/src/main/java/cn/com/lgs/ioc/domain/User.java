package cn.com.lgs.ioc.domain;

/**
 * @Author luGuoSong
 * @Date 2020/8/25 17:39
 * @Version 1.0
 */
public class User {
    private String userName;
    private String age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public void setAge(String age) {
        this.age = age;
    }
}
