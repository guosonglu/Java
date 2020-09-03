package cn.com.lgs;

/**
 * @Author luGuoSong
 * @Date 2020/7/10 17:30
 * @Version 1.0
 */
public class DemoTest3 {
    public static void main(String[] args) {
        try {
            test(15);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static void test(int num) throws MyException {
        if (num>10){
            throw new MyException("请输入小于等于10的数");
        }else {
            System.out.println(num+"符合要求");
        }
    }
}
