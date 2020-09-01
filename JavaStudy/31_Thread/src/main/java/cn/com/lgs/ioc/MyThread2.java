package cn.com.lgs.ioc;

/**
 * @Author luGuoSong
 * @Date 2020/7/21 11:14
 * @Version 1.0
 */
public class MyThread2 implements Runnable{

    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
