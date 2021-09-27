package com.tangfei.springboot_01.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Auth tangfei
 **/
@Component
@ConfigurationProperties(prefix = "user")
public class User {

    //@Value("${user.username}")
    private String username;

    private Date birthday;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
