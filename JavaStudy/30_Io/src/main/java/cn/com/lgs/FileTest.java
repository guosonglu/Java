package cn.com.lgs;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

/**
 * @Author luGuoSong
 * @Date 2020/7/15 10:15
 * @Version 1.0
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        //创建目录
        File file=new File("E:\\JavaIotest");
        System.out.println(file.mkdir());
        //创建多级目录
        File file1=new File("E:\\JavaIotest\\aa\\bb");
        System.out.println(file1.mkdirs());
        //创建文件
        File file2=new File("E:\\JavaIotest\\test.txt");
        System.out.println(file2.createNewFile());
        //判断是否为路径
        System.out.println("判断是否为路径");
        System.out.println(file.isDirectory());
        //判断是否为文件
        System.out.println("判断是否为文件");
        System.out.println(file1.isFile());
        //判断文件是否存在
        System.out.println("判断文件是否存在");
        System.out.println(file.exists());
        //获取绝对路径
        System.out.println(file.getAbsolutePath());
        //获取封装的路径
        System.out.println(file.getPath());
        //获得文件名
        System.out.println(file.getName());
        //获得路径下的目录和文件的名称数组
        System.out.println(Arrays.toString(file.list()));
        //获得路径下的目录和文件的File对象数组
        System.out.println(Arrays.toString(file.listFiles()));
        //删除文件或目录
        System.out.println(file1.delete());
    }
}
