package cn.com.lgs;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * 模拟HTTP服务器
 */
public class HTTPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(8080);
            System.out.println("服务器正在监听端口："+serverSocket.getLocalPort());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
