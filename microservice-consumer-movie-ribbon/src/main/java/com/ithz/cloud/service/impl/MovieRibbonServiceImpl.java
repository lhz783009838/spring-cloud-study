package com.ithz.cloud.service.impl;

import com.ithz.cloud.entity.User;
import com.ithz.cloud.service.MovieRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author baker
 */
@Service
public class MovieRibbonServiceImpl implements MovieRibbonService {

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public User getUserById(Long id) {
        //todo !!!! 请求地址为要调用的服务名 不是地址
        return restTemplate.getForObject("http://microsevice-provider-user/user/get/"+id,User.class);
    }
}
