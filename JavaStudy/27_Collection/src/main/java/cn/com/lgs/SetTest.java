package cn.com.lgs;

import java.util.*;

/**
 * @Author luGuoSong
 * @Date 2020/7/14 11:28
 * @Version 1.0
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world");
        for(String s:set){
            System.out.println(s);
        }
        //LinkedHashSet
        System.out.println("LinkedHashSet========================");
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
        linkedHashSet.add("aaa");
        linkedHashSet.add("bbb");
        linkedHashSet.add("ccc");
        System.out.println(linkedHashSet);  //有序

        //TreeSet
        System.out.println("TreeSet==============================");
        TreeSet<Integer> treeSet=new TreeSet<Integer>();  //自然排序
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(15);
        for (int i:treeSet){
            System.out.println(i);
        }

        //TreeSet自定义类自然排序
        System.out.println("TreeSet自定义类自然排序升序排序=====================");
        TreeSet<Student> students=new TreeSet<Student>();
        students.add(new Student("zhangsan",20));
        students.add(new Student("lisi",18));
        students.add(new Student("wangwu",17));
        students.add(new Student("hhhh",18));
        students.add(new Student("wangwu",17));
        for (Student s:students){
            System.out.println(s.getName()+":"+s.getAge());
        }

        //TreeSet比较器进行排序
        System.out.println("TreeSet比较器进行排序降序排序========================");
        TreeSet<Student> students1=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num=s2.getAge()-s1.getAge();
                int num2= num==0?s2.getName().compareTo(s1.getName()):num;
                return num2;
            }
        });
        students1.add(new Student("zhangsan",20));
        students1.add(new Student("lisi",18));
        students1.add(new Student("wangwu",17));
        students1.add(new Student("hhhh",18));
        students1.add(new Student("wangwu",17));
        for (Student s:students1){
            System.out.println(s.getName()+":"+s.getAge());
        }

        //编写一个程序，获取10个1-20之间的随机数，要求随机数不能重复，并在控制台输出
        System.out.println("编写一个程序，获取10个1-20之间的随机数，要求随机数不能重复，并在控制台输出");
        Set<Integer> set1=new HashSet<Integer>();
        while (set1.size()<10){
            set1.add(new Random().nextInt(19)+1);
        }
        for (int i:set1){
            System.out.println(i);
        }

    }
}
