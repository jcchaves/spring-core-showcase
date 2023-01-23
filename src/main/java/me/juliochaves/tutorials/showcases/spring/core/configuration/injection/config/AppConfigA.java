package me.juliochaves.tutorials.showcases.spring.core.configuration.injection.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.juliochaves.tutorials.showcases.spring.core.configuration.injection.beans.Foo;
import me.juliochaves.tutorials.showcases.spring.core.configuration.injection.beans.Bar;

@Configuration
public class AppConfigA {
	@Autowired
	private Bar bar;

	@Bean
	public Foo createFoo() {
		Foo foo = new Foo();
		foo.setBar(bar);
		return foo;
	}

}
