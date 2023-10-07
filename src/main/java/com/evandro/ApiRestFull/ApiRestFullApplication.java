package com.evandro.ApiRestFull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.evandro.ApiRestFull.model/")
public class ApiRestFullApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiRestFullApplication.class, args);
    }
}
