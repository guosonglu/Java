package cn.com.lgs.util;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author luGuoSong
 * @Date 2020/9/9 16:35
 * @Version 1.0
 * 自定义springmvc请求数据类型转换器
 */
public class MyConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        /*将日期字符串转换为日期对象*/
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        try {
            date=simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
