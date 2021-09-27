package com.tangfei.springboot_01;

import com.tangfei.springboot_01.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01ApplicationTests {

    @Autowired
    User user;


    @Test
    void contextLoads() {
        System.out.println(user.getUsername());
    }

}
