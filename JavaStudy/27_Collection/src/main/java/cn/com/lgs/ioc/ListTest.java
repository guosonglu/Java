package cn.com.lgs.ioc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author luGuoSong
 * @Date 2020/7/14 8:49
 * @Version 1.0
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("java");  //可重复
        System.out.println(list);
        //List集合特有方法
        //指定位置插入元素
        list.add(1,"test");
        System.out.println(list);
        //根据索引删除元素
        list.remove(1);
        System.out.println(list);
        //修改指定位置的元素
        list.set(3,"aaa");
        System.out.println(list);
        //根据索引获得元素
        System.out.println(list.get(1));
        //for循环根据索引遍历
        System.out.println("遍历集合=======================");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //使用ListIterator遍历
        System.out.println("使用ListIterator遍历");
        ListIterator<String> stringListIterator = list.listIterator();
        while(stringListIterator.hasNext()){
            String next = stringListIterator.next();
            if (next.equals("hello"))
                stringListIterator.add("bbb");
            System.out.println(next);
        }
        System.out.println(list);
        //增强for循环遍历
        System.out.println("增强for循环遍历");
        for (String ele:list) {
            System.out.println(ele);
        }
        //LinkList集合由链表实现，有一些特有方法
        System.out.println("LinkedList特有方法");
        LinkedList<String> list1=new LinkedList<String>();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");
        list1.addFirst("111");
        list1.addLast("222");
        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());
        System.out.println(list1.removeFirst());
        System.out.println(list1.removeLast());
        System.out.println(list1);
    }
}
