package cn.com.lgs.aop.test2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author luGuoSong
 * @Date 2020/9/1 19:26
 * @Version 1.0
 */
@Configuration
@ComponentScan("cn.com.lgs.aop.test2")
@EnableAspectJAutoProxy
public class Config {
}
