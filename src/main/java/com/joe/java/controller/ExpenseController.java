package com.joe.java.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/expense")
public class ExpenseController {

    @GetMapping("/test")
    @ResponseBody
    public void test(@RequestParam Map<String, Object> params) {
        System.out.println(params);
    }

}
