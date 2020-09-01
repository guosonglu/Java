package cn.com.lgs.ioc;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random random=new Random();
        System.out.println("生成一个随机数："+random.nextInt());
        System.out.println("生成一个0-99的随机数："+random.nextInt(100));
        System.out.println("生成一个1-99的随机数："+(random.nextInt(99)+1));
    }
}
