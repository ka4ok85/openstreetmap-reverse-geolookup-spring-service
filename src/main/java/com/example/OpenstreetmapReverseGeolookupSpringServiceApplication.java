package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OpenstreetmapReverseGeolookupSpringServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenstreetmapReverseGeolookupSpringServiceApplication.class, args);
	}
}
