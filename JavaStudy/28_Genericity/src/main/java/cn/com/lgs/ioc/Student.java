package cn.com.lgs.ioc;

/**
 * @Author luGuoSong
 * @Date 2020/7/14 16:51
 * @Version 1.0
 * 泛型类
 */
public class Student<T> {
    private T t;

    public T getT() {
        return t;
    }

    @Override
    public String toString() {
        return "Student{" +
                "t=" + t +
                '}';
    }

    //泛型方法
    public void setT(T t) {
        this.t = t;
    }
}
