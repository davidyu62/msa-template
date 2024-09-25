package com.msa.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsaServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsaServiceDiscoveryApplication.class, args);
    }

}
