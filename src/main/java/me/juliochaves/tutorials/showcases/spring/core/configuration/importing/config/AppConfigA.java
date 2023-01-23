package me.juliochaves.tutorials.showcases.spring.core.configuration.importing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.juliochaves.tutorials.showcases.spring.core.configuration.importing.beans.Foo;

@Configuration
public class AppConfigA {

	@Bean
	public Foo createFoo() {
		return new Foo();
	}

}
