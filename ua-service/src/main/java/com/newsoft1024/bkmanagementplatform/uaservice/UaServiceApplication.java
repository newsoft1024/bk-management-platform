package com.newsoft1024.bkmanagementplatform.uaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UaServiceApplication.class, args);
    }

}

