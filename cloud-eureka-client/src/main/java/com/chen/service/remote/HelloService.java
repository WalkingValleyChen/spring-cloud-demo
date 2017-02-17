package com.chen.service.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chenwl
 * @version 1.0.0
 * @date 2017/2/17
 */
@FeignClient("cloud-eureka-service")
public interface HelloService {

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name")String name);
}
