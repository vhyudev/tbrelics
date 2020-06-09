package com.lxtech.tbrelics;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(value = "com.lxtech.tbrelics.mapper")
@EnableScheduling
public class TbrelicsApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TbrelicsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TbrelicsApplication.class, args);
    }

}
