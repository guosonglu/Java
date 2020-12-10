package cn.com.lgs;

import com.alibaba.fastjson.JSONObject;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import javax.xml.soap.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) throws IOException, SOAPException, DocumentException {
        URL url = new URL("http://101.89.137.85:5000/WebServiceDemo.asmx/accessToken ");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestMethod("POST");
        connection.setUseCaches(false);
        connection.setInstanceFollowRedirects(true);
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.connect();
        OutputStream out = connection.getOutputStream();
        String content = "sInputJosnData={ \"appId\": \"UATestApp\", \"password\": \"c5d36a2fdd61fd2338c3814c6f1a78be03722fc3\" }";
        out.write(content.getBytes());
        int responseCode = connection.getResponseCode();
        System.out.println(responseCode);
        //获取当前连接请求返回的数据流
        InputStream is = connection.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        StringBuilder sb = new StringBuilder();
        String temp = null;
        while (null != (temp = br.readLine())) {
            sb.append(temp);
        }
        System.out.println(sb.toString());
        Document doc=null;
        doc = DocumentHelper.parseText(sb.toString());
        Element root = doc.getRootElement();// 指向根节点
        JSONObject jsonObject = JSONObject.parseObject(root.getTextTrim());
        System.out.println(jsonObject.getJSONObject("head").getString("status"));
        is.close();
        isr.close();
        br.close();
        out.close();
    }
}
