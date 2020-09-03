package cn.com.lgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author luGuoSong
 * @Date 2020/7/10 17:58
 * @Version 1.0
 */
public class CollectionTest {
    public static void main(String[] args) {
        //多态创建
        Collection<String> collection = new ArrayList<String>();
        //常用方法
        collection.add("Hello"); //添加元素
        collection.add("World");
        collection.add("aaa");
        collection.add("aaa");
        System.out.println(collection);
        collection.remove("aaa");  //删除元素，相同元素只会删除一个
        System.out.println(collection);
        System.out.println("是否包含Hello:" + collection.contains("Hello")); //判断集合中是否存在某元素
        System.out.println("是否为空：" + collection.isEmpty());  //判断集合是否为空
        System.out.println("当前集合中元素个数：" + collection.size());
        collection.clear();  //清空集合
        System.out.println(collection);
        //集合的遍历
        System.out.println("遍历集合==========");
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        /*
        * public Iterator<E> iterator() {
        return new Itr();
        }
        *
        *  private class Itr implements Iterator<E> {
        *   ......
        * }
        */
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
