package com.pula.authorizedonly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@PropertySource(properties = {"spring.profiles.active:uat"})
public class AuthorizedonlyApplication {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "uat");
		SpringApplication.run(AuthorizedonlyApplication.class, args);
	}

}
