package com.chinaelip.javatest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HellowController
 * @Description test
 * @Author Mr.Jangni
 * @Date 2019/10/8 19:46
 * @Version 1.0
 **/
@RestController
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "hello world!";
    }
}
