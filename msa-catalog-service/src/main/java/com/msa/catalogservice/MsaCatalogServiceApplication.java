package com.msa.catalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsaCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaCatalogServiceApplication.class, args);
	}

}
