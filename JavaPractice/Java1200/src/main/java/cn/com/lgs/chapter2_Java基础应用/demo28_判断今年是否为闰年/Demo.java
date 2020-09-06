package cn.com.lgs.chapter2_Java基础应用.demo28_判断今年是否为闰年;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

/**
 * @Author luGuoSong
 * @Date 2020/8/12 9:01
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个年份：");
            String line = scanner.nextLine();
            if ("exit".equals(line)) {
                break;
            }
            int year = 0;
            try {
                year=Integer.parseInt(line);
            }catch (NumberFormatException e){
                System.out.println("你输入的不是一个数字");
                continue;
            }
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("是闰年");
            } else {
                System.out.println("不是闰年");
            }
        }
    }
}
