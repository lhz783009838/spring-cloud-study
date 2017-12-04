package com.ithz.cloud.service;

import com.ithz.cloud.entity.User;
import com.ithz.cloud.service.impl.HystriClientCallbackImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author baker
 */
@FeignClient(name = "microsevice-provider-user",fallback = HystriClientCallbackImpl.class)
public interface FeignHystrixService {

    /**
     * 根据id获取用户
     * @param id 用户id
     * @return 用户vo
     */
    @RequestMapping(value = "/user/get/{id}")
    User getUserById(@RequestParam("id") Long id);


}
