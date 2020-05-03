package cn.itcast.web;

import cn.itcast.config.JdbcConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    /*@Autowired
    private DataSource dataSource;*/

    @GetMapping("hello")
    public String hello(){
        System.out.println("execute hello");
        return "hello, springboot";
    }
}
