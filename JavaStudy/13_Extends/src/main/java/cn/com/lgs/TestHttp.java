package cn.com.lgs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestHttp {


    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        String str2 = "yyyyMMddHHmmSS";
        SimpleDateFormat sdf = new SimpleDateFormat(str2);
        System.out.println(sdf.format(date));

        String account = "8515148598404";
        String reqNo = sdf.format(date)+"0001";
        String authCode1 = "tbd8aj8s7877";
        String serviceCode = "106571260504386204";
        String msisdn = "18939854427";
        String content = "短信测试";
        int msgType = 1;
        System.out.println(reqNo);
        String str1 = authCode1 + reqNo;

        MD5 md5 = new MD5();
        String authCode = md5.getMD5ofStr(str1.getBytes(), str1.length());

        /* url地址 */
        String URL = "http://218.201.202.174:8900/smstemp/http/sendSms";

        /* 消息参数 */
		String str = "account=" + account + "&reqNo=" + reqNo + "&authCode=" + authCode + "&serviceCode=" + serviceCode
                + "&msisdn=" + msisdn + "&content=" + content+"&msgType="+msgType;

//        String str = "account=8515&reqNo=201505151748382817&authCode=EBA6DBD79AD3CDE1E50CD1198939DEE8&serviceCode=106570001&msisdn=13800138000&content=1111&msgType=1";

        System.out.println("发送的内容为：" + str);
        /* 使用post方式发送消息 */
        String response = postURL(str, URL);

        System.out.println("返回的响应为：" + response);
    }


    /** post方式 发送url串 */
    /**
     * @param commString 需要发送的url参数串
     * @param address    需要发送的url地址
     * @return rec_string 返回的自定义格式的串
     * @catch Exception
     */
    public static String postURL(String commString, String address) {
        String rec_string = "";
        URL url = null;
        HttpURLConnection urlConn = null;
        try {
            /* 得到url地址的URL类 */
            url = new URL(address);
            /* 获得打开需要发送的url连接 */
            urlConn = (HttpURLConnection) url.openConnection();
            /* 设置连接超时时间 */
            urlConn.setConnectTimeout(30000);
            /* 设置读取响应超时时间 */
            urlConn.setReadTimeout(30000);
            /* 设置post发送方式 */
            urlConn.setRequestMethod("POST");
            /* 发送commString */
            urlConn.setDoOutput(true);
            OutputStream out = urlConn.getOutputStream();
            out.write(commString.getBytes());
            out.flush();
            out.close();
            /* 发送完毕 获取返回流，解析流数据 */
            BufferedReader rd = new BufferedReader(new InputStreamReader(urlConn.getInputStream(), "UTF-8"));
            StringBuffer sb = new StringBuffer();
            int ch;
            while ((ch = rd.read()) > -1) {
                sb.append((char) ch);
            }
            rec_string = sb.toString().trim();
            /* 解析完毕关闭输入流 */
            rd.close();
        } catch (Exception e) {
            /* 异常处理 */
            rec_string = "-107";
            System.out.println(e);
        } finally {
            /* 关闭URL连接 */
            if (urlConn != null) {
                urlConn.disconnect();
            }
        }
        /* 返回响应内容 */
        return rec_string;
    }
}
