package cn.com.lgs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author luGuoSong
 * @Date 2020/7/16 10:14
 * @Version 1.0
 */
public class CopyImg {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("JavaIotest\\img.jpg");
        FileOutputStream fileOutputStream=new FileOutputStream("JavaIotest\\imgcopy.jpg");
        byte[] bytes=new byte[1024];
        int len;
        while ((len=fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,len);
        }
        fileInputStream.close();
        fileOutputStream.close();

    }
}
