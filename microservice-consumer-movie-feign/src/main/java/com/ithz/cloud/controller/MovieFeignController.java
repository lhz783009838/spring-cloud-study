package com.ithz.cloud.controller;

import com.ithz.cloud.entity.User;
import com.ithz.cloud.service.MovieFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baker
 */
@RestController
@RequestMapping(value = "/movie")
public class MovieFeignController {

    @Autowired
    private MovieFeignService movieFeignService;

    @GetMapping(value = "/get/{id}")
    public User getUserById(@PathVariable Long id) {
        return movieFeignService.getUserById(id);
    }
}
