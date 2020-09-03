package cn.com.lgs;

/**
 * @Author luGuoSong
 * @Date 2020/7/10 14:44
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) {
        //装箱
        System.out.println(new Integer(1));
        System.out.println(new Integer("2"));
        System.out.println(Integer.valueOf(3));
        System.out.println(Integer.valueOf("4"));
        //System.out.println(Integer.valueOf("a"));  //格式化异常

        //拆箱
        Integer integer=Integer.valueOf(5);
        System.out.println(integer.intValue());

        //自动装箱
        Integer integer1=6;
    }
}
