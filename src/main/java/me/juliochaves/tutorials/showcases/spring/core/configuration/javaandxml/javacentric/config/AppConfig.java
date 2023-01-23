package me.juliochaves.tutorials.showcases.spring.core.configuration.javaandxml.javacentric.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import me.juliochaves.tutorials.showcases.spring.core.configuration.javaandxml.javacentric.beans.Foo;

@Configuration
@ImportResource("classpath:com/spring/tutorial/configuration/javaandxml/javacentric/applicationContext.xml")
public class AppConfig {
	private @Value("${bar}") String bar;

	@Bean
	public Foo createFoo() {
		Foo foo = new Foo();
		foo.setBar(bar);
		return foo;
	}

}
