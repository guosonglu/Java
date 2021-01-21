package cn.com.lgs;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 模拟HTTP服务器
 */
public class HTTPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("服务器正在监听端口：" + serverSocket.getLocalPort());
            while (true) {
                try {
                    final Socket socket = serverSocket.accept();
                    System.out.println("建立了与客户端的一个新的TCP链接，该客户的地址为：" + socket.getInetAddress() + ":" + socket.getPort());
                    service(socket);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void service(Socket socket) throws Exception {
        InputStream socketIn = socket.getInputStream();
        Thread.sleep(500);
        int size = socketIn.available();
        byte[] buffer = new byte[size];
        socketIn.read(buffer);
        String request = new String(buffer);

    }
}
