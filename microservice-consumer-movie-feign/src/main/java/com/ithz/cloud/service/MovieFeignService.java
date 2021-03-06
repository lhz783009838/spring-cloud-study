package com.ithz.cloud.service;

import com.ithz.cloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author baker
 */
@FeignClient(name = "microsevice-provider-user")
public interface MovieFeignService {

    /**
     * 根据用户id获取用户
     *
     * @param id 用户id
     * @return 用户vo
     */
    @RequestMapping(value = "/user/get/{id}")
    User getUserById(@RequestParam("id") Long id);
}
