package com.wengyingjian.weidian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.wengyingjian.kylin", "com.wengyingjian.weidian"})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class ApiApp extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(ApiApp.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ApiApp.class);
    }
}