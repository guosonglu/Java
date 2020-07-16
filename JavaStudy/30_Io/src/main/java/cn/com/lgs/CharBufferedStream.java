package cn.com.lgs;

import java.io.*;

/**
 * @Author luGuoSong
 * @Date 2020/7/16 15:16
 * @Version 1.0
 */
public class CharBufferedStream {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("JavaIotest\\charbufferfile.txt"));
        bufferedWriter.write("缓冲字符输出流");
        bufferedWriter.newLine();
        bufferedWriter.write("测试");
        bufferedWriter.close();
        BufferedReader bufferedReader=new BufferedReader(new FileReader("JavaIotest\\charbufferfile.txt"));
//        char[] chars=new char[1024];
//        int len;
//        while ((len=bufferedReader.read(chars))!=-1){
//            System.out.println(new String(chars,0,len));
//        }
        String line;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
