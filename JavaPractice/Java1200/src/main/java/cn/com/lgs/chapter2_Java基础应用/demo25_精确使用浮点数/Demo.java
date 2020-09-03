package cn.com.lgs.chapter2_Java基础应用.demo25_精确使用浮点数;

import java.math.BigDecimal;

/**
 * @Author luGuoSong
 * @Date 2020/8/7 11:11
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("非精确计算2-1.1结果："+(2-1.1));
        System.out.println("精确计算2-1.1结果："+(new BigDecimal(2).subtract(new BigDecimal(1.1))));
    }
}
