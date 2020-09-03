package cn.com.lgs;

import java.util.Objects;

/**
 * @Author luGuoSong
 * @Date 2020/7/9 15:46
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) {
        People people=new People("张三",20);
        People people1=new People();
        System.out.println(people);  //重写了toString,则打印内容，否则打印地址值
        System.out.println(people.equals(people1));
        System.out.println(Objects.equals(people,people1));  //防止空指针异常
    }
}
