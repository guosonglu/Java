package cn.com.lgs.ioc;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author luGuoSong
 * @Date 2020/7/25 14:10
 * @Version 1.0
 */
public class DemoTest1 {
    public static void main(String[] args) {
        //函数式接口作为参数
        startThread(()-> System.out.println(Thread.currentThread().getName()+"线程启动了"));
        //函数式接口作为返回值
        ArrayList<String> list=new ArrayList<>();
        list.add("cc");
        list.add("aaa");
        list.add("ddd");
        list.add("bbbb");
        //自然排序
        Collections.sort(list);
        System.out.println("自然排序结果："+list);
        //比较器排序
        Collections.sort(list,getComparator());
        System.out.println("比较器排序结果："+list);
    }

    //函数式接口作为参数
    public static void startThread(Runnable r){
        Thread thread=new Thread(r);
        thread.start();
    }

    //函数式接口作为返回值
    public static Comparator<String> getComparator(){
        return (s1,s2)->s1.length()-s2.length();
    }
}
