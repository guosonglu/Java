package cn.com.lgs.chapter2_Java基础应用.demo28_判断今年是否为闰年;

import java.util.Scanner;

/**
 * @Author luGuoSong
 * @Date 2020/8/12 9:01
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        long year = scanner.nextLong();
        if (year%4==0&&year%100!=0||year%400==0){
            System.out.println("是闰年");
        }else{
            System.out.println("不是闰年");
        }
    }
}
