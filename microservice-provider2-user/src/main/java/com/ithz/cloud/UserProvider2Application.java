package com.ithz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author baker
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(UserProvider2Application.class,args);
    }
}
