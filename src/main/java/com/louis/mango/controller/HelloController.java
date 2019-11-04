package com.louis.mango.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){

        return "hello word!";
    }

    @RequestMapping(value = "/word")
    public String get(){

        return "word!";
    }
}
