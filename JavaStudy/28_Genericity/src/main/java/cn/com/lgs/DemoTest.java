package cn.com.lgs;

/**
 * @Author luGuoSong
 * @Date 2020/7/14 16:53
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) {
        //泛型类
        System.out.println("自定义泛型类=========================");
        Student<Integer> student1=new Student<Integer>();
        student1.setT(1);
        System.out.println(student1);
        Student<String> student2=new Student<String>();
        student2.setT("张三");
        System.out.println(student2);
    }
}
