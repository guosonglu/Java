package cn.com.lgs;

/**
 * @Author luGuoSong
 * @Date 2020/7/10 14:09
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();  //空参数构造
        System.out.println(stringBuilder);
        StringBuilder stringBuilder1=new StringBuilder("aaa");
        System.out.println(stringBuilder1);
        StringBuilder stringBuilder2 = stringBuilder1.append("bbb");
        System.out.println(stringBuilder2);
        System.out.println(stringBuilder1==stringBuilder2);  //append返回的还是当前地址值
        //StringBuilder转String
        String string1=stringBuilder2.toString();
    }
}
