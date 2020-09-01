package cn.com.lgs.ioc.chapter2_Java基础应用.demo26_不用乘法运算实现2x16;

import java.util.Scanner;

/**
 * @Author luGuoSong
 * @Date 2020/8/7 11:23
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        long l = scanner.nextLong();
        System.out.println("你输入的数为："+l);
        System.out.println("该数乘以2结果为："+(l<<1));
        System.out.println("该数乘以4结果为："+(l<<2));
        System.out.println("该数乘以8结果为："+(l<<3));
        System.out.println("该数乘以16结果为："+(l<<4));
    }
}
