package cn.com.lgs;

import cn.com.lgs.aop.test.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author luGuoSong
 * @Date 2020/9/1 16:04
 * @Version 1.0
 * XML配置AOP测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JunitAopTest {
    @Autowired
    private TargetInterface target;

    @Test
    public void test(){
        target.save2();
    }
}
