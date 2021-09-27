package com.tangfei.springboot_01;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot01Application {

    public static void main(String[] args) throws Exception {
        //声明日志记器SLF4J
     Logger logger = LoggerFactory.getLogger(Springboot01Application.class);
        SpringApplication.run(Springboot01Application.class,args);
        logger.trace("跟踪");
        logger.debug("调试");
        logger.info("信息");
        logger.warn("警告");
        logger.error("异常");

    }

}
