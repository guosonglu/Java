package cn.com.lgs.chapter2_Java基础应用.demo27_两变量值交换采用异或;

import java.util.Scanner;

/**
 * @Author luGuoSong
 * @Date 2020/8/12 8:52
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入变量A的值：");
        long A = scanner.nextLong();
        System.out.println("请输入变量B的值：");
        long B = scanner.nextLong();
        System.out.println("你输入的参数为：A="+A+",B="+B);
        A=A^B;
        B=A^B;
        A=A^B;
        System.out.println("转换后的结果为：A="+A+",B="+B);
    }
}
