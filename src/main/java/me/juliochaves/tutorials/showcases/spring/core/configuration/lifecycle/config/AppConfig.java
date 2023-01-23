package me.juliochaves.tutorials.showcases.spring.core.configuration.lifecycle.config;

import me.juliochaves.tutorials.showcases.spring.core.configuration.lifecycle.beans.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(initMethod = "init")
	public Foo createFoo() {
		return new Foo();
	}
}
