package cn.com.lgs.ioc.chapter2_Java基础应用.demo23_位运算;

import java.util.Scanner;

/**
 * @Author luGuoSong
 * @Date 2020/8/5 15:22
 * @Version 1.0
 * 异或操作实现String加解密
 */
public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入待加密字符串：");
        String s = scanner.nextLine();

        System.out.println("加密前的数为："+s);
        String s2=test(s);
        System.out.println("加密后结果为："+s2);
        System.out.println("解密后：："+test(s2));
    }

    public static String test(String str){
        int num=8888;
        char[] chars = str.toCharArray();
        for (int i=0;i<chars.length;i++){
            chars[i]=(char)(chars[i]^num);
        }
        return new String(chars);
    }
}


