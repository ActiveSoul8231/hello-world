package com.anbo.cilicili;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.*"})
public class CiliciliApplication {

    public static void main(String[] args) {
        SpringApplication.run(CiliciliApplication.class, args);
    }

}
