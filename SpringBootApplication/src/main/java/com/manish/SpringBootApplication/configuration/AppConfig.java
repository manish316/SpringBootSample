package com.manish.SpringBootApplication.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	// Creating ModelMapper Bean Configuration
	@Bean
	public ModelMapper getModuleMapper() {
		return new ModelMapper();
	}

}
