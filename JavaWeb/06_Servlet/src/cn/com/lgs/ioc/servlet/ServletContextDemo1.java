package cn.com.lgs.ioc.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author luGuoSong
 * @Date 2020/8/5 8:57
 * @Version 1.0
 */
@WebServlet("/ServletContext1")
public class ServletContextDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获得servletcontext对象
        ServletContext servletContext = getServletContext();
        ServletContext servletContext1 = req.getServletContext();
        //获得mime类型
        String s = "a.jpg";
        String mimeType = servletContext.getMimeType(s);
        System.out.println(mimeType);
        //域对象
        servletContext.setAttribute("msg","aaa");

    }
}
