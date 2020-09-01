package cn.com.lgs.ioc;

/**
 * @Author luGuoSong
 * @Date 2020/7/21 13:39
 * @Version 1.0
 */
public class Tickets implements Runnable {
    private int tickets = 100;
    private Object obj = new Object();

    public void run() {
        synchronized (obj) {
            while (tickets > 0) {
                tickets--;
                System.out.println(Thread.currentThread().getName() + "卖了一张票，剩余：" + tickets);
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
