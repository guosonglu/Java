package cn.com.lgs;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author luGuoSong
 * @Date 2020/7/20 10:02
 * @Version 1.0
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.setProperty("001","测试1");
        properties.setProperty("002","测试2");
        properties.setProperty("003","测试3");
        properties.setProperty("004","测试4");
        FileWriter fileWriter = new FileWriter("JavaIotest\\properties.txt");
        //序列化
        properties.store(fileWriter,null);
        fileWriter.close();
        //反序列化
        Properties properties2=new Properties();
        FileReader fileReader = new FileReader("JavaIotest\\properties.txt");
        properties2.load(fileReader);
        System.out.println(properties2);
        fileReader.close();
    }
}
