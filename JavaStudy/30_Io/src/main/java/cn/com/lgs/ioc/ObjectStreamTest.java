package cn.com.lgs.ioc;

import java.io.*;

public class ObjectStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //对象序列化流
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("JavaIotest\\objectStream.txt"));
        objectOutputStream.writeObject(new String("测试"));
        objectOutputStream.close();
        //对象反序列化流
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("JavaIotest\\objectStream.txt"));
        System.out.println(objectInputStream.readObject().toString());
        objectInputStream.close();
    }
}
