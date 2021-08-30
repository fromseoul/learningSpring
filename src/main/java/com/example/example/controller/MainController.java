package com.example.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MainController {

    Logger logger = LoggerFactory.getLogger("com.example.controller");

    @GetMapping("/ex02")
    public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
        logger.info("name:" + name);
        logger.info("age:" + age);
        return "ex02";
    }
}
