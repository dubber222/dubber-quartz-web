package com.dubber.quartz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dubber on 2018/5/11.
 */
public class Main {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }
}
