package cn.com.lgs.ioc;

import java.util.Arrays;

/**
 * @Author luGuoSong
 * @Date 2020/7/10 9:54
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        int[] src={1,2,3,4,5};
        int[] dest={5,6,7,8,9};
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
    }
}
