package com.example.general;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = {"com.example.consumer", "com.example.producer"})
@PropertySource(value = {"classpath:application-producer.properties"})
public class GeneralApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeneralApplication.class, args);
    }

}
