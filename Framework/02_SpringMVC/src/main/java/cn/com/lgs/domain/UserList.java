package cn.com.lgs.domain;

import java.util.List;

/**
 * @Author luGuoSong
 * @Date 2020/9/7 17:47
 * @Version 1.0
 */
public class UserList {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "UserList{" +
                "userList=" + userList +
                '}';
    }
}
