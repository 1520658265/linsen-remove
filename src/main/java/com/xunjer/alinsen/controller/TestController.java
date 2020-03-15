package com.xunjer.alinsen.controller;

import com.xunjer.alinsen.common.model.ResultModel;
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
    public ResultModel<String> hello() {
        return new ResultModel<>("Hello Spring Boot");
    }

    @RequestMapping(value = "get",method = RequestMethod.GET)
    public ResultModel<AlinsenEvent> hello11(Integer eventId) {
        return new ResultModel<>(iAlinsenService.findById(eventId));
    }

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<AlinsenEvent> hellddo11() {
        return iAlinsenService.findAll();
    }

}
