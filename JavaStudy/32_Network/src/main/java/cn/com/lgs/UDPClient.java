package cn.com.lgs;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @Author luGuoSong
 * @Date 2020/7/22 11:01
 * @Version 1.0
 */
public class UDPClient {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象
        DatagramSocket datagramSocket=new DatagramSocket();
        //创建DatagramPacket数据报包对象
        byte[] bytes = "我是数据，期间送去就送去加哦加哦去我就送去降低".getBytes();
        System.out.println("请输入接收端口：");
        Scanner scanner=new Scanner(System.in);
        int port = scanner.nextInt();
        DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),port);
        //发送数据
        datagramSocket.send(datagramPacket);
        //关闭连接
        datagramSocket.close();
    }
}
