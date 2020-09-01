package cn.com.lgs.ioc;

/**
 * @Author luGuoSong
 * @Date 2020/4/29 11:22
 * @Version 1.0
 * 字符串比较
 *  == 对地址值比较
 *  equals 内容比较
 *  equalsIgnoreCase 内容比较，忽略大小写
 */
public class Demo3 {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="HELLO";
        char[] charArray={'H','e','l','l','o'};
        String str3=new String(charArray);
        System.out.println(str1.equals(str3)); //true
        //字符串常量和字符变量比较，一般将常量放前面，防止变量为空值
        System.out.println("Hello".equals(str1)); //true
        //忽略大小写比较
        System.out.println(str1.equalsIgnoreCase(str2)); //true
    }
}
