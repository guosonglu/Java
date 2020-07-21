package cn.com.lgs;

/**
 * @Author luGuoSong
 * @Date 2020/7/21 10:03
 * @Version 1.0
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
