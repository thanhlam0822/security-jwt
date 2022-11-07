package com.sha.springbootdeviceseller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication

public class SpringBootDeviceSellerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDeviceSellerApplication.class, args);
	}

}
