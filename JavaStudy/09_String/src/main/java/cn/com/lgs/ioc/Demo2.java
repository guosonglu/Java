package cn.com.lgs.ioc;

/**
 * @Author luGuoSong
 * @Date 2020/4/29 10:40
 * @Version 1.0
 * 字符串的常量池
 */
public class Demo2 {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";
        char[] charArray={'a','b','c'};
        String str3=new String(charArray);
        System.out.println(str1==str2); //true
        System.out.println(str1==str3); //false
    }
}
