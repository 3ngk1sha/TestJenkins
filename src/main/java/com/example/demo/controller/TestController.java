package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping(value = "rest", method = RequestMethod.GET)
public class TestController {
    @RequestMapping(value = "/hello/{param}")
    public String sayhello(@PathVariable("param") String param) {
        return "Hello " + param;
    }

}
