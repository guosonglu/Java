package cn.com.lgs;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Author luGuoSong
 * @Date 2020/7/22 13:52
 * @Version 1.0
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建socket对象
        Socket socket=new Socket(InetAddress.getLocalHost(),8888);
        //键盘录入数据
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //将socket键盘输出流转换为字符缓冲输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //获取输出流，写数据
        String line;
        while ((line=bufferedReader.readLine())!=null){
            if (line.equals("exit")){
                break;
            }
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        socket.close();
    }
}
