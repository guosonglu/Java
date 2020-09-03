package cn.com.lgs;

import java.io.*;
import java.util.Scanner;

/**
 * @Author luGuoSong
 * @Date 2020/7/16 15:52
 * @Version 1.0
 */
public class SystemStream {
    public static void main(String[] args) throws IOException {
        //自己实现标准键盘输入
        System.out.println("请输入");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入的字符为："+bufferedReader.readLine());

        //Scanner类实现了上面相同的功能
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入：");
        System.out.println("输入的内容为："+scanner.next());

        //标准输出流
        //本质上是字节打印输出流
        PrintStream out = System.out;
        out.println("aaa");

    }
}
