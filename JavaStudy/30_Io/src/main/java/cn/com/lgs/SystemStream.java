package cn.com.lgs;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @Author luGuoSong
 * @Date 2020/7/16 15:52
 * @Version 1.0
 */
public class SystemStream {
    public static void main(String[] args) {
        //自己实现标准键盘输入
        System.out.println("请输入");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


    }
}
