package cn.com.lgs.ioc;

import java.util.ArrayList;

/**
 * @Author luGuoSong
 * @Date 2020/4/28 10:41
 * @Version 1.0
 */
/*包装类的使用*/
public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        //自动装箱
        list.add(100);
        list.add(200);
        System.out.println(list);
        //自动拆箱
        int num=list.get(1);

    }
}
