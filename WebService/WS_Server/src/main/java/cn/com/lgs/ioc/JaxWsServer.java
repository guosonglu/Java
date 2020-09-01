package cn.com.lgs.ioc;

import javax.xml.ws.Endpoint;

public class JaxWsServer {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8888/mobile",new UAWebServiceImpl());
        System.out.println("服务发布成功");
    }
}
