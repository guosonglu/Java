package cn.com.lgs.ioc;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author luGuoSong
 * @Date 2020/7/14 18:04
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String, String>();
        //添加元素
        map.put("001","张三");
        map.put("002","李四");
        map.put("003","王五");
        System.out.println(map);
        //移除元素
        System.out.println("移除元素");
        map.remove("003");
        System.out.println(map);
        //清空元素
        System.out.println("清空元素");
        map.clear();
        System.out.println(map);
        map.put("001","张三");
        map.put("002","李四");
        map.put("003","王五");
        //判断元素是否存在
        System.out.println("判断元素是否存在");
        System.out.println(map.containsKey("001"));
        System.out.println(map.containsValue("王五五"));
        //判断集合是否为空
        System.out.println("判断集合是否为空:"+map.isEmpty());
        //获得集合长度
        System.out.println("获得集合的长度："+map.size());
        //根据键获取值
        System.out.println("根据键获取值："+map.get("001"));
        //获得所有键
        Set<String> set = map.keySet();
        System.out.println("获得所有键："+set);
        //获得所有值
        Collection<String> values = map.values();
        System.out.println("获得所有值："+values);
        //遍历方式1
        System.out.println("遍历方式1===========================");
        for (String s:set){
            System.out.println(s+":"+map.get(s));
        }
        //遍历方式2
        System.out.println("遍历方式2===========================");
        Set<Map.Entry<String, String>> entries = map.entrySet();  //获得所有键值对的集合
        for (Map.Entry<String, String> entry:entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
