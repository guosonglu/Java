package cn.com.lgs.ioc;

import java.io.*;

/**
 * @Author luGuoSong
 * @Date 2020/7/15 15:13
 * @Version 1.0
 * Io流示例
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream=null;
        try {
            new File("JavaIotest").mkdirs(); //防止文件夹不存在
            fileOutputStream=new FileOutputStream("JavaIotest\\a.txt");
            //java.io.FileOutputStream fileOutputStream=new java.io.FileOutputStream("E:\\JavaIotest\\a.txt",true); 追加写入
            fileOutputStream.write(97);
            fileOutputStream.write(57);
            fileOutputStream.write(55);
            fileOutputStream.write("abcde\n".getBytes());
            fileOutputStream.write("klmngs\n".getBytes(),1,3);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileOutputStream!=null) {  //只有在输出流不为null时才释放资源
                try {
                    fileOutputStream.close();  //关闭输出流，关闭与输出流相关的资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
