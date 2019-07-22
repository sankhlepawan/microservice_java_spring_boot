package com.sample.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringSampleCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSampleCommonApplication.class, args);
	}

}
