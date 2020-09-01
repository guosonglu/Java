package cn.com.lgs.ioc;

import cn.com.lgs.aop.test2.Config;
import cn.com.lgs.aop.test2.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author luGuoSong
 * @Date 2020/9/1 19:34
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
public class JunitAopTest2 {

    @Autowired
    private TargetInterface targe;

    @Test
    public void test1(){
        targe.save();
    }
}
