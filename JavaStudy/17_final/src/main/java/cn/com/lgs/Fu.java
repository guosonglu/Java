package cn.com.lgs;

/**
 * @Author luGuoSong
 * @Date 2020/7/8 16:11
 * @Version 1.0
 */
//加final修饰，该类将不再有子类继承
public final class Fu {
    final int index=1;  //final修饰成员变量,需要直接赋值或者在构造中赋值，且不能修改

//    final修饰的方法不能覆盖重写
    public final void method(){
        System.out.println("aaa");
    }
}
