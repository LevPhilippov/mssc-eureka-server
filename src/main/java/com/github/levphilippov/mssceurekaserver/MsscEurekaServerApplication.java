package com.github.levphilippov.mssceurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsscEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscEurekaServerApplication.class, args);
    }

}
