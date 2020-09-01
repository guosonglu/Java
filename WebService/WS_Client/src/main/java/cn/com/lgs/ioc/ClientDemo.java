package cn.com.lgs.ioc;

import wsdl.UAWebServiceImpl;
import wsdl.UAWebServiceImplService;

public class ClientDemo {
    public static void main(String[] args) {
        UAWebServiceImplService uaWebServiceImplService=new UAWebServiceImplService();
        UAWebServiceImpl uaWebServiceImplPort = uaWebServiceImplService.getUAWebServiceImplPort();
        System.out.println(uaWebServiceImplPort.getString("测试字符"));
    }
}
