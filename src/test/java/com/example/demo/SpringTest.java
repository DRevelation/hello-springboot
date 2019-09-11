package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

/**
 * @Auther DRevelation
 * @Date 2019-07-08 14:33
 * @Desc
 */
public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("");
        ctx.getBean("");

        ApplicationContext ctx2 = new GenericGroovyApplicationContext("");
    }
}
