package cn.com.lgs.ioc.service.Impl;

import cn.com.lgs.ioc.dao.StudentDao;
import cn.com.lgs.ioc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author luGuoSong
 * @Date 2020/9/1 10:02
 * @Version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    public void save() {
        studentDao.save();
    }
}
