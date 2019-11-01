package com.kunlun.baize.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 18555
 * @Date 2019/10/30 23:27
 * @Since 1.0.0
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "hello" + name;
    }
}
