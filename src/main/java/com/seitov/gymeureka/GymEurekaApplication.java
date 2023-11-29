package com.seitov.gymeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GymEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymEurekaApplication.class, args);
	}

}
