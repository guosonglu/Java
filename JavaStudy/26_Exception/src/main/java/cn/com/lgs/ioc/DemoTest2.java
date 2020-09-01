package cn.com.lgs.ioc;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author luGuoSong
 * @Date 2020/7/10 17:02
 * @Version 1.0
 */
public class DemoTest2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.parse("111");
    }
}
