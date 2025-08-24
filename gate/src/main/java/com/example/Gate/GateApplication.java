package com.example.Gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {
		"com.example.Gate",     // Your main package
		"com.filter" // Where your filter is
})
public class GateApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateApplication.class, args);
	}

}
