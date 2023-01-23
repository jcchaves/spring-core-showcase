package me.juliochaves.tutorials.showcases.spring.core.configuration.easenavigation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.juliochaves.tutorials.showcases.spring.core.configuration.easenavigation.beans.Foo;

@Configuration
public class AppConfigA {
	@Autowired
	private AppConfigB appConfigB;

	@Bean
	public Foo createFoo() {
		Foo foo = new Foo();
		foo.setBar(appConfigB.createBar());
		return foo;
	}

}
