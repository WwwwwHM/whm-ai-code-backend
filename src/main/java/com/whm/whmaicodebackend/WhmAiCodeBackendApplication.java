package com.whm.whmaicodebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.whm.whmaicodebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class WhmAiCodeBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhmAiCodeBackendApplication.class, args);
    }

}
