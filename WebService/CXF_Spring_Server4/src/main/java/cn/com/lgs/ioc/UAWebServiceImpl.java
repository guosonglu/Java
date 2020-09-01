package cn.com.lgs.ioc;

import javax.jws.WebService;

@WebService
public class UAWebServiceImpl implements UAWebService {


    public String getAddressByNumber(String number) {
        return number+":归属地是上海";
    }

    public int add(int a, int b) {
        return a+b;
    }
}
