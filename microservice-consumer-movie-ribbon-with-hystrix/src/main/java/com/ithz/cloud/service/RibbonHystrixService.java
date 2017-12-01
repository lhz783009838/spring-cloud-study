package com.ithz.cloud.service;

import com.ithz.cloud.entity.User;

/**
 * @author baker
 */
public interface RibbonHystrixService {

    /**
     * 根据id获取用户
     * @param id 用户id
     * @return 用户vo
     */
    User getUserById(Long id);
}
