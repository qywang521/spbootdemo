package com.example.demo.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @Value("${book.name}")
    private String name ;
    private final Logger logger=Logger.getLogger(this.getClass());

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String index(){
        ServiceInstance localServiceInstance = discoveryClient.getLocalServiceInstance();
        logger.info("/hello,host:"+localServiceInstance.getHost()+",service_id:"+localServiceInstance.getServiceId());
        return "Hello spboot"+name;
    }
}
