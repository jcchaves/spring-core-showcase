package me.juliochaves.tutorials.showcases.spring.core.configuration.naming.config;

import javax.inject.Named;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.juliochaves.tutorials.showcases.spring.core.configuration.naming.beans.Bar;
import me.juliochaves.tutorials.showcases.spring.core.configuration.naming.beans.Foo;

@Configuration
public class AppConfig {

	@Bean(name = "myFoo")
	public Foo createFoo() {
		return new Foo();
	}

	@Bean(name = "myFooWithBar")
	public Foo createFooWithBar(@Named("normal") Bar bar) {
		Foo foo = new Foo();
		bar.setKind("normal");
		foo.setBar(bar);
		return foo;
	}

	@Bean(name = "myFooWithExtremeBar")
	public Foo createFooWithExtremeBar(@Named("extreme") Bar bar) {
		Foo foo = new Foo();
		bar.setKind("extreme");
		foo.setBar(bar);
		return foo;
	}

	@Bean
	@Named("normal")
	public Bar createBar() {
		return new Bar();
	}

	@Bean
	@Named("extreme")
	public Bar createExtremeBar() {
		return new Bar();
	}
}
