package cn.com.lgs;

/**
 * @Author luGuoSong
 * @Date 2020/7/23 14:33
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) {
        //Lambda
        test((s)->{
            System.out.println(s);
        });
        //方法引用
        test(System.out::printf);
    }

    public static void test(Cat cat){
        cat.eat("猫吃鱼");
    }
}
