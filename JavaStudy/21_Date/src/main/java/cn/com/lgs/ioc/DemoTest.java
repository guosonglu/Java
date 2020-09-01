package cn.com.lgs.ioc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author luGuoSong
 * @Date 2020/7/9 16:00
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) throws ParseException {
        System.out.println(System.currentTimeMillis());  //获得距离1970年1月1日 08：00：00的毫秒值 类型 long
        System.out.println(new Date()); //获得当前系统的日期和时间
        System.out.println(new Date(1000));  //获得距离1970年1月1日 08：00：00 1000毫秒的时间
        System.out.println(new Date().getTime());  //将日期转换成毫秒值
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));  //把日期转格式化成文本
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-13"));  //将字符串转换为Date对象，如果字符串与格式不一样，则抛出异常
    }
}
