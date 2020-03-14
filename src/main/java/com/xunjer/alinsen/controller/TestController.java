package com.xunjer.alinsen.controller;

import com.xunjer.alinsen.entity.AlinsenEvent;
import com.xunjer.alinsen.service.IAlinsenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by linsen
 * Date on 2020/3/12 20:01
 * 明日复明日 明日何其多
 */
@RestController()
@RequestMapping("text")
public class TestController {

    @Autowired
    private IAlinsenService iAlinsenService;

    @RequestMapping(value = "text",method = RequestMethod.GET)
    public String hello() {
        return "Hello Spring Boot";
    }

    @RequestMapping(value = "text1",method = RequestMethod.GET)
    public String hello1() {
        return "我是用来测试不需要输入密码的";
    }

    @RequestMapping(value = "get",method = RequestMethod.GET)
    public AlinsenEvent hello11(Integer id) {
        return iAlinsenService.findById(id);
    }

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<AlinsenEvent> hellddo11() {
        return iAlinsenService.findAll();
    }

}
