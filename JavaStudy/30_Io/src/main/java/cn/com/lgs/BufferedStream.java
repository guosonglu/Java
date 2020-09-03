package cn.com.lgs;

import java.io.*;

/**
 * @Author luGuoSong
 * @Date 2020/7/16 11:00
 * @Version 1.0
 */
public class BufferedStream {
    public static void main(String[] args) throws IOException {
        //缓冲区写入数据
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream("JavaIotest\\buffered.txt"));
        bufferedOutputStream.write("hello\n".getBytes());
        bufferedOutputStream.write("world测试".getBytes());
        bufferedOutputStream.close();

        //缓冲区读取数据
        BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream("JavaIotest\\buffered.txt"));
        byte[] bytes=new byte[1024];
        int len;
        while((len=bufferedInputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bufferedInputStream.close();
    }
}
