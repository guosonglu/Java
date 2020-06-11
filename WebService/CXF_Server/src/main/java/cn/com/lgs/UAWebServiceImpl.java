package cn.com.lgs;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;


public class UAWebServiceImpl implements UAWebService {

    @Override
    public String getAddressByNumber(String number) {
//        先处理客户端传递过来的参数
//        从数据库查询数据
        String result=number+"的归属地是上海";
//        将结果返回给客户端
        return result;
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
