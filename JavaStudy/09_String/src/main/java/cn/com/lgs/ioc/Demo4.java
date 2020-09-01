package cn.com.lgs.ioc;

/**
 * @Author luGuoSong
 * @Date 2020/5/9 9:25
 * @Version 1.0
 */
public class Demo4 {
    public static void main(String[] args) {
        String str1="Hello";
        //获得字符串长度
        System.out.println(str1.length());  //5
        //字符串拼接
        System.out.println(str1.concat("aaa")); //Helloaaa
        //获得指定索引的单个字符
        System.out.println(str1.charAt(1));  //e
        //查找参数字符串在字符串中出现的首次位置，如果没有，返回-1
        System.out.println(str1.indexOf("ll"));  //2
        //字符串截取
        String str2="HelloHelloHello";
        System.out.println(str2.substring(10)); //Hello
        //左闭右开截取 [begin,end)
        System.out.println(str2.substring(5,10));  //Hello
        //将字符串转换为字符数组
        char[] charArray=str1.toCharArray();
        System.out.println(charArray[0]); //H
        //获得字符串当前的字节数据
        byte[] byteArray=str1.getBytes();
        System.out.println(byteArray[0]);  //72
        //替换
        System.out.println(str1.replace("ll","aa"));
        //分割字符串,注意：参数不能是英文句号 . 得用 \\.
        String str3="aaa,bbb,ccc";
        String[] arrays=str3.split(",");
        for (int i = 0; i <arrays.length ; i++) {
            System.out.println(arrays[i]);
        }
    }
}
