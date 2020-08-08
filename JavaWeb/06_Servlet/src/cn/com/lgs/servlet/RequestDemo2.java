package cn.com.lgs.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspFactory;
import java.io.IOException;

/**
 * @Author luGuoSong
 * @Date 2020/7/29 14:57
 * @Version 1.0
 */
@WebServlet("/request2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("/request2");
        req.setAttribute("test", "域对象共享数据");  //设置域对象，一次请求中使用
        req.getRequestDispatcher("/request3").forward(req, resp);
    }
}
