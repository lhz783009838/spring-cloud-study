package com.ithz.cloud.service.impl;

import com.ithz.cloud.entity.User;
import com.ithz.cloud.service.RibbonHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author baker
 */
@Service
public class RibbonHystrixServiceImpl implements RibbonHystrixService {

    private static final Logger logger = LoggerFactory.getLogger(RibbonHystrixServiceImpl.class);

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    @Override
    public User getUserById(Long id) {
        return restTemplate.getForObject("http://microsevice-provider-user/user/get/" + id, User.class);
    }

    public User fallback(Long id) {
        logger.info("发送异常，进入异常处理 ");
        User user = new User();
        user.setId(-1L);
        user.setAge(-1);
        user.setUsername("default name");
        return user;
    }
}
