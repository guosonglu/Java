package cn.com.lgs.listener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author luGuoSong
 * @Date 2020/9/3 14:03
 * @Version 1.0
 * 自定义监听器,实际应用中
 */
public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        /*在监听器中获取applicationContext对象，并存储到servletContext域中*/
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(contextConfigLocation);
        servletContext.setAttribute("context",applicationContext);
        System.out.println("监听器执行");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
