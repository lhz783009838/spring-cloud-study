package com.ithz.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baker
 */
@RestController
@RequestMapping(value = "/")
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello world for provider-2";
    }
}
