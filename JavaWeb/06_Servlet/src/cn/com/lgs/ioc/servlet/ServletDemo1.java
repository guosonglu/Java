package cn.com.lgs.ioc.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author luGuoSong
 * @Date 2020/7/28 9:31
 * @Version 1.0
 * Servlet快速入门
 */
public class ServletDemo1 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println(servletRequest);
        System.out.println("Hello");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
