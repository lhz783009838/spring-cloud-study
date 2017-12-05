package com.ithz.cloud.controller;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baker
 */
@RefreshScope
@RestController
public class ConfigController {

    @Value("${profile}")
    private String profile;

    @GetMapping(value = "/config")
    public String getConfig(){
        System.out.println(profile);
        return profile;
    }
}
