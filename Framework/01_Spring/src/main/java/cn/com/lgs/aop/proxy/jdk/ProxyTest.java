package cn.com.lgs.aop.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author luGuoSong
 * @Date 2020/9/1 10:53
 * @Version 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        final Target target=new Target();
        final Advice advice=new Advice();

        //返回值就是动态生成的代理对象
        TargetInterface proxy = (TargetInterface)Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        advice.before();
                        Object invoke = method.invoke(target, args);
                        advice.after();
                        return invoke;
                    }
                }
        );
        proxy.save();
    }
}
