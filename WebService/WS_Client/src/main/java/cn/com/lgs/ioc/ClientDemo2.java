package cn.com.lgs.ioc;

import wsdl.UAWebServiceImpl;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class ClientDemo2 {
    public static void main(String[] args) throws MalformedURLException {
        Service service=Service.create(new URL("http://127.0.0.1:8888/mobile?wsdl"),new QName("http://lgs.com.cn/","UAWebServiceImplService"));
        UAWebServiceImpl port = service.getPort(UAWebServiceImpl.class);
        System.out.println(port.getString("测试"));
    }
}
