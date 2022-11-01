package com.ishtiyaque.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String example() {
        return "hello";
    }
}

