package cn.com.lgs;

import java.util.Scanner;

//Scanner类的功能，可以实现键盘输入数据到程序当中
public class Demo1 {
    public static void main(String[] args) {
        //System.in表示从键盘输入
        Scanner scanner=new Scanner(System.in);
        System.out.printf("请输入一个数：");
        int temp1=scanner.nextInt();
        System.out.println("输入的数字为："+temp1);
        //计算两数之和
        System.out.println("开始计算两数之和：");
        System.out.print("请输入第一个数：");
        int temp2=scanner.nextInt();
        System.out.print("请输入第二个数：");
        int temp3=scanner.nextInt();
        int temp4=temp2+temp3;
        System.out.println(temp2+"+"+temp3+"="+temp4);
    }
}
