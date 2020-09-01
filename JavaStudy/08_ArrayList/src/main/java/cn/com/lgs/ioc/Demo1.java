package cn.com.lgs.ioc;
import java.util.ArrayList;
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        //打印的是内容，而不是地址
        System.out.println(list);
        //添加元素
        list.add("测试1");
        list.add("测试2");
        list.add("测试3");
        list.add("测试4");
        System.out.println(list);
        //获取元素
        System.out.println(list.get(1));
        //删除元素
        list.remove(0);
        System.out.println(list);
        //获得集合长度
        System.out.println(list.size());
    }
}
