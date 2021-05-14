package com.jk.qyq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class SpringcloudPoviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudPoviderApplication.class, args);
    }


}
