package cn.com.lgs;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author luGuoSong
 * @Date 2020/7/10 15:42
 * @Version 1.0
 */
public class DemoTest {
    //运行时异常
    /*
        jvm自动处理，程序终止
        开始
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at cn.com.lgs.DemoTest.main(DemoTest.java:12)*/
    public static void main(String[] args) {
        int[] ints={1,2,3};
        System.out.println("开始");
        try {
            System.out.println(ints[3]);  //异常后程序终止
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("你访问的数组不存在");
            System.out.println(e.getMessage());  //异常信息
            System.out.println(e.toString());    //异常信息加异常类名
            e.printStackTrace();  //异常信息加异常类名加出错位置，并打印输出
        }
        System.out.println("结束");
        //编译时异常
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            simpleDateFormat.parse("112233");
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
