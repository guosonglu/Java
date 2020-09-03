package cn.com.lgs;

import cn.com.lgs.domain.User;
import cn.com.lgs.util.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * @Author luGuoSong
 * @Date 2020/8/29 15:25
 * @Version 1.0
 * 使用spring的JdbcTemplate对象操作数据库
 */
public class JdbcDemo8 {
    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DruidUtils.getDataSource());
        //更改数据
        String sql1="update user set age = 22 where name =?";
        int i = jdbcTemplate.update(sql1, "张三");
        System.out.println(i);
        //查询数据
        String sql2="select * from user";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql2);
        System.out.println(maps.toString());
        String sql3="select * from user where name = ?";
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap(sql3,"张三");
        System.out.println(stringObjectMap.toString());
        List<User> query = jdbcTemplate.query(sql2, new BeanPropertyRowMapper<User>(User.class));
        for (User user:query){
            System.out.println(user);
        }
    }
}
