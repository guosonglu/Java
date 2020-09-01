package cn.com.lgs.aop.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author luGuoSong
 * @Date 2020/9/1 10:53
 * @Version 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        final Target target = new Target();
        final Advice advice = new Advice();

        //返回值就是动态生成的代理对象
        //1.创建增强器
        Enhancer enhancer=new Enhancer();
        //2.设置父类（目标）
        enhancer.setSuperclass(Target.class);
        //3.设置回调
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                advice.before();
                Object invoke = method.invoke(target, objects);
                advice.after();
                return invoke;
            }
        });
        //4.生成代理对象
        Target target1 = (Target) enhancer.create();
        //增强测试
        target1.save();
    }
}
