package com.pijush;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TicketApplication {

	public static void main(String[] arguments) {
		SpringApplication.run(TicketApplication.class, arguments);
	}
}
