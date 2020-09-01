package cn.com.lgs.ioc.chapter2_Java基础应用.demo21重定向输出流实现日志;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @Author luGuoSong
 * @Date 2020/7/25 15:10
 * @Version 1.0
 * 重定向输出流
 */
public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out=System.out;
        System.setOut(new PrintStream("./log.txt"));
        System.out.println("日志信息1");
        System.out.println("日志信息2");
        //重定向回来
        System.setOut(out);
        System.out.println("日志输出完毕");

    }
}
