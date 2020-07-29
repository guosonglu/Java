package cn.com.lgs.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @Author luGuoSong
 * @Date 2020/7/28 11:27
 * @Version 1.0
 * 继承Servlet抽象子类GenericServlet
 */
@WebServlet("/demo3")
public class ServletDemo3 extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello3");
    }
}
