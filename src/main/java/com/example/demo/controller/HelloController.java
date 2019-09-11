package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther DRevelation
 * @Date 2019-06-12 14:48
 * @Desc
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
