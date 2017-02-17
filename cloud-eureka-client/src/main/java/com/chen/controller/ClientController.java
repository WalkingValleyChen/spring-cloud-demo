package com.chen.controller;

import com.chen.service.remote.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chenwl
 * @version 1.0.0
 * @date 2017/2/17
 */
@RestController
public class ClientController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    public String home() {
        return helloService.hello("chen");
    }
}
