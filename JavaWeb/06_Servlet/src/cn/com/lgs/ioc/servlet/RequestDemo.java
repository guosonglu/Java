package cn.com.lgs.ioc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @Author luGuoSong
 * @Date 2020/7/28 17:22
 * @Version 1.0
 */
@WebServlet("/request")
public class RequestDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*请求行*/
        System.out.println("获得请求行参数==========");
        System.out.println("请求方法为："+req.getMethod());
        System.out.println("虚拟目录："+req.getContextPath()); //重点
        System.out.println("servlet路径："+req.getServletPath());
        System.out.println("get参数获取:"+req.getQueryString());
        System.out.println("请求uri："+req.getRequestURI());
        System.out.println("请求url："+req.getRequestURL());
        System.out.println("协议和版本："+req.getProtocol());
        System.out.println("客户机IP地址："+req.getRemoteAddr());
        /*获取请求头*/
        System.out.println("获取请求头参数==========");
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String s = headerNames.nextElement();
            System.out.println(s+":"+req.getHeader(s));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*请求行*/
        System.out.println("获得请求行参数==========");
        System.out.println("请求方法为："+req.getMethod());
        System.out.println("虚拟目录："+req.getContextPath()); //常用
        System.out.println("servlet路径："+req.getServletPath());
        System.out.println("请求uri统一资源标识符："+req.getRequestURI()); //常用
        System.out.println("请求url统一资源定位符："+req.getRequestURL());
        System.out.println("协议和版本："+req.getProtocol());
        System.out.println("客户机IP地址："+req.getRemoteAddr());
        /*获取请求头*/
        System.out.println("获取请求头参数==========");
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String s = headerNames.nextElement();
            System.out.println(s+":"+req.getHeader(s));
        }
        /*获取请求体*/
        System.out.println("获得请求体");
        /*获取请求参数通用的方式*/
        /*解决post中文乱码*/
        req.setCharacterEncoding("utf-8");
        System.out.println("根据名称获得参数："+req.getParameter("name"));
        System.out.println("根据名称获得参数数组："+req.getParameterValues("name"));
        System.out.println("获得名称数组："+req.getParameterNames().toString());
        System.out.println("获得参数集合："+req.getParameterMap().toString());
        /*数据流获得参数*/
//        BufferedReader reader = req.getReader();
//        String line=null;
//        while ((line=reader.readLine())!=null){
//            System.out.println(line);
//        }

    }
}
