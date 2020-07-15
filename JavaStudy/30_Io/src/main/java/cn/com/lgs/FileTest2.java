package cn.com.lgs;

import java.io.File;

/**
 * @Author luGuoSong
 * @Date 2020/7/15 14:58
 * @Version 1.0
 * 递归遍历文件夹
 */
public class FileTest2 {
    public static void main(String[] args) {
        printPath(new File("E:\\JavaIotest"));
    }

    public static void printPath(File file){
        File[] files = file.listFiles();
        for (File file1:files){
            if (file1.isDirectory()){
                System.out.println(file1.getName());
                printPath(file1);
            }else {
                System.out.println(file1.getName());
            }
        }
    }
}
