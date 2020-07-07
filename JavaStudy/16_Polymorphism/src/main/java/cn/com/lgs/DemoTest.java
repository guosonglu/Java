package cn.com.lgs;

/**
 * @Author luGuoSong
 * @Date 2020/7/7 9:40
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) {
        Fu fu=new Zi();
        fu.method();
        fu.methodFu();
        System.out.println(fu.num);  //等号左边是谁，优先使用谁

        //向下转型
        //错误写法，运行会报错 java.lang.classCastException
        //Zi2 zi2=(Zi2)fu;
        //zi2.methodZi2();  //向下转型只能用new自己的子类
        //正确写法
        Zi zi=(Zi)fu;
        zi.methodZi();

        //判断一个父类对象是什么子类
        if (fu instanceof Zi){
            System.out.println("fu的子类是Zi");
        }else{
            System.out.println("fu的子类不是Zi");
        }
    }
}
