package com.ymt.grpc.controller;

import com.ymt.grpc.service.HelloClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @Autowired
    HelloClientService helloClientService;

    @GetMapping(value = "/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "yumingtao") String name) {
        log.info("hello called...");
        return helloClientService.sayHello(name);
    }
}
