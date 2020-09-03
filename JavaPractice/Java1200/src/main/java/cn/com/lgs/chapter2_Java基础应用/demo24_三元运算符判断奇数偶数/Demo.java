package cn.com.lgs.chapter2_Java基础应用.demo24_三元运算符判断奇数偶数;

import java.util.Scanner;

/**
 * @Author luGuoSong
 * @Date 2020/8/7 11:00
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("奇偶数判断");
        while(true) {
            System.out.println("请输入一个整数：");
            long l = scanner.nextLong();
            System.out.println((l % 2 == 0) ? "是偶数" : "是奇数");
        }
    }
}
