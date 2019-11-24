package me.rrsn.dogms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DogMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogMsApplication.class, args);
	}

}
