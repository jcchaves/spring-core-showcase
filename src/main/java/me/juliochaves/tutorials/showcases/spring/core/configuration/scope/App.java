package me.juliochaves.tutorials.showcases.spring.core.configuration.scope;

import me.juliochaves.tutorials.showcases.spring.core.configuration.scope.beans.Foo;
import me.juliochaves.tutorials.showcases.spring.core.configuration.scope.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);
		Foo foo1 = ctx.getBean(Foo.class);
		Foo foo2 = ctx.getBean(Foo.class);
		((AnnotationConfigApplicationContext) ctx).close();
	}
}
