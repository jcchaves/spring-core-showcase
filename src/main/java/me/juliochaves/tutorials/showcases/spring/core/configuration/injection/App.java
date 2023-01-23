package me.juliochaves.tutorials.showcases.spring.core.configuration.injection;

import me.juliochaves.tutorials.showcases.spring.core.configuration.injection.beans.Foo;
import me.juliochaves.tutorials.showcases.spring.core.configuration.injection.config.AppConfigB;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfigB.class);
		Foo foo = ctx.getBean(Foo.class);
		LOGGER.info("Foo.bar = " + foo.getBar());
		((AnnotationConfigApplicationContext) ctx).close();
	}
}
