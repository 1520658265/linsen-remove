package com.xunjer.alinsen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by linsen
 * Date on 2020/3/12 20:01
 * 明日复明日 明日何其多
 */
@RestController()
@RequestMapping("text")
public class TestController {

    @RequestMapping(value = "text",method = RequestMethod.GET)
    public String hello() {
        return "Hello Spring Boot";
    }

    @RequestMapping(value = "text1",method = RequestMethod.GET)
    public String hello1() {
        return "Hello Spring Boot1";
    }

}
