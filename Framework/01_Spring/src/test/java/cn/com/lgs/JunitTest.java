package cn.com.lgs;

import cn.com.lgs.config.BeanConfig;
import cn.com.lgs.dao.StudentDao;
import cn.com.lgs.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author luGuoSong
 * @Date 2020/9/1 8:46
 * @Version 1.0
 * Spring整合Junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConfig.class})
public class JunitTest {
    @Autowired
    private StudentDao student;

    @Autowired
    private StudentService studentService;

    @Test
    public void test1(){
        student.save();
    }

    @Test
    public void test2(){
        studentService.save();
    }
}
