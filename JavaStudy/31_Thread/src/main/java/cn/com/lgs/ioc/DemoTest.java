package cn.com.lgs.ioc;

/**
 * @Author luGuoSong
 * @Date 2020/7/21 10:04
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) throws InterruptedException {
        //方式一
        MyThread myThread1=new MyThread();
        MyThread myThread2=new MyThread();
        myThread1.setName("线程1");
        myThread2.setName("线程2");
        //获得线程的优先级
        System.out.println(myThread1.getPriority()); //5
        System.out.println(myThread2.getPriority()); //5
        //设置线程优先级
        myThread1.setPriority(1);
        myThread2.setPriority(10); //数字越大优先级越高
        //设置守护线程，虚拟机退出，线程也退出
        myThread2.setDaemon(true);
        //开始线程
        myThread1.start();
        myThread2.start();
        //等待线程死亡
        myThread1.join();

        System.out.println(Thread.currentThread().getName());  //获得当前线程

        //方式二
        Thread thread=new Thread(new MyThread2());
        thread.setName("方式二");
        thread.start();

    }
}
