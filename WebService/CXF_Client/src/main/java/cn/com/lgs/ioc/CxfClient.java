package cn.com.lgs.ioc;


import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import wsdl.UAWebService;

public class CxfClient {
    public static void main(String[] args) {
        //构建本地代理工厂
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean=new JaxWsProxyFactoryBean();
        //设置属性
        //设置服务地址
        jaxWsProxyFactoryBean.setAddress("http://127.0.0.1:8889/mobile");
        //设置桩接口
        //jaxWsProxyFactoryBean.setServiceClass(UAWebService.class);
        jaxWsProxyFactoryBean.getInInterceptors().add(new LoggingInInterceptor());

        jaxWsProxyFactoryBean.getOutInterceptors().add(new LoggingOutInterceptor());

        //创建工厂，得到桩对象
        UAWebService object = jaxWsProxyFactoryBean.create(UAWebService.class);

        //打印
        System.out.println(object.getAddressByNumber("123"));
    }
}
