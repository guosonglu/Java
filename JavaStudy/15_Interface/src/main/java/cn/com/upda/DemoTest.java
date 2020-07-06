package cn.com.upda;

/**
 * @Author luGuoSong
 * @Date 2020/7/6 10:13
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) {
        MyInterfaceImpl myInterface=new MyInterfaceImpl();
        myInterface.method1();
        myInterface.method2();
        MyInterface.method3();  //静态方法直接调用
    }
}
