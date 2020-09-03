package cn.com.lgs;

/**
 * @Author luGuoSong
 * @Date 2020/4/29 10:12
 * @Version 1.0
 * 字符串的创建
 */
public class Demo1 {
    public static void main(String[] args) {
        //使用空构造
        String str1=new String();
        System.out.println(str1);

        //使用字符数组创建字符串
        char[] charArray={'A','B','C'};
        String str2=new String(charArray);
        System.out.println(str2);

        //使用字节数据创建字符串
        byte[] byteArray={'a','b','c'};
        String str3=new String(byteArray);
        System.out.println(str3);

        //直接创建
        String str4="Hello";
        System.out.println(str4);

    }
}
