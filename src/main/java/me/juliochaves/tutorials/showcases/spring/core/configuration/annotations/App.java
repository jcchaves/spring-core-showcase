package me.juliochaves.tutorials.showcases.spring.core.configuration.annotations;

import me.juliochaves.tutorials.showcases.spring.core.configuration.annotations.beans.Foo;
import me.juliochaves.tutorials.showcases.spring.core.configuration.annotations.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);
		Foo foo = ctx.getBean(Foo.class);
		((AnnotationConfigApplicationContext) ctx).close();
	}
}
