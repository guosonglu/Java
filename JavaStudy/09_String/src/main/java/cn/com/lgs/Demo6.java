package cn.com.lgs;

import java.util.Scanner;

/**
 * @Author luGuoSong
 * @Date 2020/5/9 10:11
 * @Version 1.0
 * 	键盘输入一串字符串，统计大写字母、小写字母、数字、其它出现的个数
 */
public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("请输入字符串：");
        String str1=scanner.next();
        int num1,num2,num3,num4;
        num1=num2=num3=num4=0;
        byte[] bytes=str1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            int num=bytes[i];
            if (num>=65&&num<=90)
                num1++;
            else if (num>=97&&num<=122)
                num2++;
            else if (num>=48&&num<=57)
                num3++;
            else
                num4++;
        }
        System.out.println("统计结果为：");
        System.out.println("大写字母："+num1);
        System.out.println("小写字母："+num2);
        System.out.println("数字："+num3);
        System.out.println("其它："+num4);
    }
}
