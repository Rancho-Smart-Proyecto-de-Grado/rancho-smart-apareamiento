package com.rancho_smart.apareamiento_composer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApareamientoComposerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApareamientoComposerApplication.class, args);
	}

}
