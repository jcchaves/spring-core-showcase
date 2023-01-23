package me.juliochaves.tutorials.showcases.spring.core.configuration.importing;

import me.juliochaves.tutorials.showcases.spring.core.configuration.importing.beans.Bar;
import me.juliochaves.tutorials.showcases.spring.core.configuration.importing.beans.Foo;
import me.juliochaves.tutorials.showcases.spring.core.configuration.importing.config.AppConfigB;
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
		LOGGER.info("Foo = " + foo);
		Bar bar = ctx.getBean(Bar.class);
		LOGGER.info("Bar = " + bar);
		((AnnotationConfigApplicationContext) ctx).close();
	}
}
