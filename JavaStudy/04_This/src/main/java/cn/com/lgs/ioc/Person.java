package cn.com.lgs.ioc;

public class Person {
    String name; //名字

    public void sayHello(String name){
        System.out.println("你好，"+name+"我是"+this.name);
    }
}
