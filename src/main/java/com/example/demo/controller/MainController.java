package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "welcome to first Spring boot Demo";
    }

    @RequestMapping("/home")

    public String index() {
        return "index";
    }

}
