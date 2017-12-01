package com.ithz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author baker
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MovieRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieRibbonApplication.class, args);
    }

    /**
     * 实例化RestTemplate,开启负载均衡调用
     *
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
