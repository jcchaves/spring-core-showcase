package me.juliochaves.tutorials.showcases.spring.core.configuration.scope.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import me.juliochaves.tutorials.showcases.spring.core.configuration.scope.beans.Foo;

@Configuration
public class AppConfig {

	@Bean
	@Scope("prototype")
	public Foo createFoo() {
		return new Foo();
	}
}
