package com.smallbird.backend.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages="com.smallbird.backend.platform.workflow.mapper")
public class SmallBirdApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallBirdApplication.class, args);
    }

}
