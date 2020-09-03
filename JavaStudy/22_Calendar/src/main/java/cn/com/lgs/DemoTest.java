package cn.com.lgs;

import java.util.Calendar;

/**
 * @Author luGuoSong
 * @Date 2020/7/9 18:11
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();  //静态方法获得子类对象
        System.out.println(calendar.get(Calendar.YEAR));  //
        calendar.set(Calendar.MONTH,5);  //设置月份
        System.out.println(calendar.getTime());
    }
}
