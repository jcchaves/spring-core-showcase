package me.juliochaves.tutorials.showcases.spring.core.configuration.importing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import me.juliochaves.tutorials.showcases.spring.core.configuration.importing.beans.Bar;

@Configuration
@Import(AppConfigA.class)
public class AppConfigB {

	@Bean
	public Bar createBar() {
		return new Bar();
	}
}
