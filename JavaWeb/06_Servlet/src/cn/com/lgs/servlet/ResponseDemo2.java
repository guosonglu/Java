package cn.com.lgs.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author luGuoSong
 * @Date 2020/8/4 9:12
 * @Version 1.0
 * 重定向
 */
@WebServlet("/response2")
public class ResponseDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setStatus(302);
//        resp.setHeader("location","/06_Servlet_war_exploded/response1");
        resp.sendRedirect("/06_Servlet_war_exploded/response1");
    }
}
