package cn.com.lgs;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author luGuoSong
 * @Date 2020/7/15 16:38
 * @Version 1.0
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("E:\\JavaIotest\\a.txt");
        byte[] bytes=new byte[1024];
        int len;
        while ((len=fileInputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fileInputStream.close();
    }
}
