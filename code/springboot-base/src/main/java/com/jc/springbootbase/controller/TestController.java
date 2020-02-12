package com.jc.springbootbase.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController会自动将输出内容转化为JSON格式
@RestController
public class TestController {
    // @RequestMapping("/test") 提供路由信息，"/test" 路径的 HTTP Request 都会被映射到 test() 方法上进行处理。
    @RequestMapping("/test")
    String test(String name){
        return "test, " + name;
    }
}
