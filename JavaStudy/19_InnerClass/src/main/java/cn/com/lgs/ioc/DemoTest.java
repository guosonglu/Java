package cn.com.lgs.ioc;

/**
 * @Author luGuoSong
 * @Date 2020/7/8 17:33
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) {
        Body body=new Body();
        body.method();  //间接调用内部类
        Body.Heart heart=new Body().new Heart();
        heart.beat();  //直接new内部类调用
        heart.showNum();  //重名变量访问问题
        body.method2();  //局部内部类使用
        //匿名内部类，大多用于只用一次的接口或抽象类，重写里面的抽象方法
        Body body2=new Body(){
            @Override
            public void method() {
                System.out.println("匿名内部类");
            }
        };
        body2.method();
    }
}
