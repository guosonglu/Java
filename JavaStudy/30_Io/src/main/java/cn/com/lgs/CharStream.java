package cn.com.lgs;

import java.io.*;

/**
 * @Author luGuoSong
 * @Date 2020/7/16 14:20
 * @Version 1.0
 * 字符流
 */
public class CharStream {
    public static void main(String[] args) throws IOException {
        //字符流写文件
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream("JavaIotest\\charfile.txt"),"GBK");
        outputStreamWriter.write("a测试\n");
        outputStreamWriter.write("第二行");
        outputStreamWriter.close();
        //字符流读文件
        InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("JavaIotest\\charfile.txt"),"GBK");
        char[] chars=new char[1024];
        int len;
        while((len=inputStreamReader.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        inputStreamReader.close();
    }
}
