package cn.com.lgs.ioc.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author luGuoSong
 * @Date 2020/8/5 9:25
 * @Version 1.0
 * 文件下载servlet
 */
@WebServlet("/download")
public class DownloadDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        resp.setHeader("Content-disposition","attachment;filename=aa.jpg");
        resp.setHeader("content-type",servletContext.getMimeType("1.jpg"));
        ServletOutputStream outputStream = resp.getOutputStream();

        FileInputStream fileInputStream = new FileInputStream(servletContext.getRealPath("/img/1.jpg"));
        byte[] bytes=new byte[1024];
        int len;
        while ((len=fileInputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,len);
        }
        fileInputStream.close();
    }
}
