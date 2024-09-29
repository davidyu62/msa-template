package com.msa.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsaOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaOrderServiceApplication.class, args);
	}

}
