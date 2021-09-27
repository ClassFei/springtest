package com.sundata.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auth tangfei
 **/
@RestController
public class OrderController {

    private final RestTemplate restTemplate;

    public OrderController(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }

    @RequestMapping("order")
    public  String  order(){
        //下订单  给商品应用发信息
        //restTemplate.exchange()
        return "ssss";
    }
}
