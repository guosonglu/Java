package cn.com.lgs.ioc.chapter2_Java基础应用.demo20_从控制台接收输入字符;

import java.util.Scanner;

/**
 * @Author luGuoSong
 * @Date 2020/7/25 15:06
 * @Version 1.0
 * 从控制台输入字符
 */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入身份证号码：");
        String line =scanner.nextLine();
        System.out.println("你输入的身份证号码为："+line.length()+"位");
    }
}
