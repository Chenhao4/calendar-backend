package com.chen.calendar.controller;

import com.alibaba.fastjson.JSONObject;
import com.chen.calendar.entity.TextVo;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author chenhao
 * @date 2020/5/6 0006 15:14
 */
@RestController
@RequestMapping("view")
public class CalendarController {

    @GetMapping("/year")
    public JSONObject getYear() {
        JSONObject ret = new JSONObject();
        ret.put("year", 2020);
        String text = ((Math.random() * 10) > 5) ? "何事秋风悲画扇" : "应是天仙狂醉，乱把白云揉碎。";
        ret.put("text", text);

        return ret;
    }

    @PostMapping("/text")
    public JSONObject saveText(@RequestBody TextVo text) {
        System.out.println(text);
        return null;
    }
}
