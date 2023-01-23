package me.juliochaves.tutorials.showcases.spring.core.configuration.componentscan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.juliochaves.tutorials.showcases.spring.core.configuration.componentscan.beans.Foo;

@Configuration
public class AppConfig {

	@Bean
	public Foo createFoo() {
		return new Foo();
	}
}
