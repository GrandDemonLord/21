/*
 * Copyright (c) Shanghai Qitong Information Technology Co., LTD 2023-2099
 */

package com.kunyu.asset.safety.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * @description 启动类
 * @author yangliu
 * @date 2023-08-02
 */
@SpringBootApplication(scanBasePackages = "com.kunyu")
@MapperScan("com.kunyu.assets.safety.infrastructure")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.kunyu.assets.safety.domain.feignclients")
public class Application {
    /**
     * @description 启动方法
     * @param args args
     * @return null null
     * @author yangliu
     * @date 2023/8/2
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
