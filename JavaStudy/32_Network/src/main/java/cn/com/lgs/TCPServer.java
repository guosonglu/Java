package cn.com.lgs;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author luGuoSong
 * @Date 2020/7/22 14:14
 * @Version 1.0
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);
        Socket accept = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String line;
        while((line=bufferedReader.readLine())!=null){
            System.out.println("服务器接收到："+line);
        }
        serverSocket.close();
    }
}
