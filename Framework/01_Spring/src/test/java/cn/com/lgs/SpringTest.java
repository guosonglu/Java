package cn.com.lgs;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author luGuoSong
 * @Date 2020/8/21 14:21
 * @Version 1.0
 */
public class SpringTest {
    @Test
    //测试scope属性
    public void test1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object userDao1 = applicationContext.getBean("userDao");
        Object userDao2 = applicationContext.getBean("userDao");
        System.out.println(userDao1);
        System.out.println(userDao2);
        //通过工厂静态方法获取对象
        Object userDao21 = applicationContext.getBean("userDao2");
        System.out.println(userDao21);
        //通过工厂非静态方法获得对象
        Object userDao3 = applicationContext.getBean("userDao3");
        System.out.println(userDao3);
    }
}
