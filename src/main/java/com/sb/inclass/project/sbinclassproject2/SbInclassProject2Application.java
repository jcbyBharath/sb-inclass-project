package com.sb.inclass.project.sbinclassproject2;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@OpenAPIDefinition
@EnableCaching
@EnableDiscoveryClient
public class SbInclassProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(SbInclassProject2Application.class, args);
	}

}
