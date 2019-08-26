package com.example.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example"})
public class SpringmvcprogramApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcprogramApplication.class, args);
		/*SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringApplication.class);
		builder.headless(false);
		ConfigurableApplicationContext context = builder.run(args);*/

	}

}
