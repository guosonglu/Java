package cn.com.lgs;

import javax.xml.soap.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

public class Test85 {
    public static void main(String[] args) throws IOException, SOAPException {
        URL url = new URL("http://101.89.137.85:5000/WebServiceDemo.asmx?WSDL");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("content-type", "text/xml;charset=utf-8");
        connection.setDoInput(true);
        connection.setDoOutput(true);
        String soapXML = "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n" +
                "  <soap12:Body>\n" +
                "    <accessToken xmlns=\"http://UPDA2020.org/\">\n" +
                "      <sInputJosnData>{ \"appId\": \"UATestApp\", \"password\": \"c5d36a2fdd61fd2338c3814c6f1a78be03722fc3\" }</sInputJosnData>\n" +
                "    </accessToken>\n" +
                "  </soap12:Body>\n" +
                "</soap12:Envelope>";
        OutputStream os = connection.getOutputStream();
        os.write(soapXML.getBytes());
        int responseCode = connection.getResponseCode();
        if (200 == responseCode) {//表示服务端响应成功
            //获取当前连接请求返回的数据流
            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String temp = null;
            while (null != (temp = br.readLine())) {
                sb.append(temp);
            }

            /**
             * 打印结果
             */
            System.out.println(sb.toString());
            SOAPMessage msg = formatSoapString(sb.toString());
            SOAPBody body = msg.getSOAPBody();
            Iterator<SOAPElement> iterator = body.getChildElements();
            String s = PrintBody(iterator, null);
            System.out.println(s);
            is.close();
            isr.close();
            br.close();
        }
        os.close();
    }

    private static SOAPMessage formatSoapString(String soapString) {
        MessageFactory msgFactory;
        try {
            msgFactory = MessageFactory.newInstance();
            SOAPMessage reqMsg = msgFactory.createMessage(new MimeHeaders(),
                    new ByteArrayInputStream(soapString.getBytes("UTF-8")));
            reqMsg.saveChanges();
            return reqMsg;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String PrintBody(Iterator<SOAPElement> iterator, String side) {
        while (iterator.hasNext()) {
            SOAPElement element = (SOAPElement) iterator.next();
            if (null == element.getValue()
                    && element.getChildElements().hasNext()) {
                return PrintBody(element.getChildElements(), side + "-----");
            } else
                return element.getValue();
        }
        return null;
    }
}
