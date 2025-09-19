package me.juliochaves.tutorials.showcases.spring.core.configuration.componentscan;

import me.juliochaves.tutorials.showcases.spring.core.configuration.componentscan.beans.Foo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext();
		((AnnotationConfigApplicationContext) ctx)
				.scan("com.spring.tutorial.configuration.componentscan.config");
		((AnnotationConfigApplicationContext) ctx).refresh();
		ctx.getBean(Foo.class);
		((AnnotationConfigApplicationContext) ctx).close();
	}
}
