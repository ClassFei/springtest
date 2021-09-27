package com.sundata.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auth tangfei
 **/
@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping("{id}")
    public void  selUser(@PathVariable String  id ){
        System.out.println(id);
    }
}
