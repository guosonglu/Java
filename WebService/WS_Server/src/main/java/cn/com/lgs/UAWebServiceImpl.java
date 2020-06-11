package cn.com.lgs;

import javax.jws.WebService;

@WebService
public class UAWebServiceImpl implements UAWebService{

    public String getString(String inString) {
        return "输入的字符串为："+inString;
    }
}
