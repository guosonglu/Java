package cn.com.lgs;

/**
 * @Author luGuoSong
 * @Date 2020/7/8 16:58
 * @Version 1.0
 */
public class Fu {
    public int num1=1; //任何人可以访问
    protected int num2=2; //不同包的没关系的不可以访问
    int num3=3; //不同包的没关系的和不同包的子类不可以访问
    private int num4=4; //只有自己可以访问
}
