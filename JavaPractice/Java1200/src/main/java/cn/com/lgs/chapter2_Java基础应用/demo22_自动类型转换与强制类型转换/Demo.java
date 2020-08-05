package cn.com.lgs.chapter2_Java基础应用.demo22_自动类型转换与强制类型转换;

/**
 * @Author luGuoSong
 * @Date 2020/7/25 15:31
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        //基本数据类型范围打印
        System.out.println("byte的范围为："+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
        System.out.println("char的范围为："+(int)Character.MIN_VALUE+"-"+(int)Character.MAX_VALUE);
        System.out.println("short的范围为："+Short.MIN_VALUE+"-"+Short.MAX_VALUE);
        System.out.println("int的范围为："+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);
        System.out.println("long的范围："+Long.MIN_VALUE+"-"+Long.MAX_VALUE);
        System.out.println("float的范围："+Float.MIN_VALUE+"-"+Float.MAX_VALUE);
        System.out.println("double的范围："+Double.MIN_VALUE+"-"+Double.MAX_VALUE);
        byte b=127;
        char c='W';
        short s=23561;
        int i=3333;
        long l=400000L;
        float f=3.14f;
        double d=54.523;
        //低类型向高类型自动转换
        System.out.println("累加byte等于："+b);
        System.out.println("累加char等于："+(b+c));
        System.out.println("累加short等于："+(b+c+s));
        System.out.println("累加int等于："+(b+c+s+i));
        System.out.println("累加long等于："+(b+c+s+i+l));
        System.out.println("累加float等于："+(b+c+s+i+l+f));
        System.out.println("累加double等于："+(b+c+s+i+l+f+d));
    }
}
