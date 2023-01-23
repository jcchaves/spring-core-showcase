package me.juliochaves.tutorials.showcases.spring.core.configuration.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.juliochaves.tutorials.showcases.spring.core.configuration.annotations.beans.Foo;

@Configuration
public class AppConfig {

	@Bean
	public Foo createFoo() {
		return new Foo();
	}
}
