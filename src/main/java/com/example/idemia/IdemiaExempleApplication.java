package com.example.idemia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IdemiaExempleApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdemiaExempleApplication.class, args);
    }

}
