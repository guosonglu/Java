package cn.com.lgs;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author luGuoSong
 * @Date 2020/7/22 10:05
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.getHostName());
        System.out.println(localHost.getHostAddress());
    }
}
