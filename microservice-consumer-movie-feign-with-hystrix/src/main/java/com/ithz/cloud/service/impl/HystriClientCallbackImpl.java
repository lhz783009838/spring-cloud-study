package com.ithz.cloud.service.impl;

import com.ithz.cloud.entity.User;
import com.ithz.cloud.service.FeignHystrixService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author baker
 */
@Component
public class HystriClientCallbackImpl implements FeignHystrixService {

    private static final Logger logger = LoggerFactory.getLogger(HystriClientCallbackImpl.class);

    @Override
    public User getUserById(Long id) {
        logger.info("异常发生，进入异常处理");
        User user = new User();
        user.setId(-1L);
        user.setUsername("defaultName");
        user.setAge(-1);
        return user;
    }
}
