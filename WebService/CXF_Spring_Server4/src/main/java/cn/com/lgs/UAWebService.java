package cn.com.lgs;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/*sei接口*/
//sei实现类
@WebService //标识这是一个ws的sei的类
//@BindingType(value = SOAPBinding.SOAP12HTTP_BINDING) //用来指定WebService服务端的soap版本
public interface UAWebService {
    /*定义一个业务*/

    /**
     * 根据手机号查询归属地信息
     * @param number
     * @return 归属地信息字符串
     */
    public String getAddressByNumber(String number);

    /**
     * 加法运算
     * @param a
     * @param b
     * @return 得到两数之和
     */
    public int add(int a, int b);
}
