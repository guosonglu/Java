package cn.com.lgs;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author luGuoSong
 * @Date 2020/7/16 14:43
 * @Version 1.0
 */
public class CharStream2 {
    public static void main(String[] args) throws IOException {
        //字符流写文件
        FileWriter fileWriter=new FileWriter("JavaIotest\\charfile2.txt");
        fileWriter.write("测试2\n");
        fileWriter.write("字符流");
        fileWriter.close();
        //字符流读文件
        FileReader fileReader=new FileReader("JavaIotest\\charfile2.txt");
        char[] chars=new char[1024];
        int len;
        while((len=fileReader.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        fileReader.close();
    }
}
