package cn.com.lgs;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
/*使用CXF创建WebService*/
public class CxfServer {
    public static void main(String[] args) {
        //获得实例化工厂
        JaxWsServerFactoryBean serverFactoryBean=new JaxWsServerFactoryBean();
        //设置工厂属性
        //接口
        serverFactoryBean.setServiceClass(UAWebService.class);
        //实现类
        serverFactoryBean.setServiceBean(new UAWebServiceImpl());
        //服务地址
        serverFactoryBean.setAddress("http://127.0.0.1:8889/mobile");
        //增加拦截器
        //拦截请求
        serverFactoryBean.getInInterceptors().add(new LoggingInInterceptor());
        //拦截响应
        serverFactoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
        //发布服务
        serverFactoryBean.create();
        System.out.println("发布成功");
    }
}
