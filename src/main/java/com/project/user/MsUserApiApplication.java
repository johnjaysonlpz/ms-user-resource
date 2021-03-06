package com.project.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.project"})
@EntityScan(basePackages = { 
		"com.project.base.common.resources.client",
		"com.project.base.common.resources.permission",
		"com.project.base.common.resources.role",
		"com.project.base.common.resources.user" })
public class MsUserApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsUserApiApplication.class, args);
	}

}
