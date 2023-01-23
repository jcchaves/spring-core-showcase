package me.juliochaves.tutorials.showcases.spring.core.configuration.naming;

import me.juliochaves.tutorials.showcases.spring.core.configuration.naming.beans.Foo;
import me.juliochaves.tutorials.showcases.spring.core.configuration.naming.config.AppConfig;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);
		Foo foo = ctx.getBean("myFoo", Foo.class);
		LOGGER.info("(Without bar) Foo.bar = " + foo.getBar());
		Foo fooWithBar = ctx.getBean("myFooWithBar", Foo.class);
		LOGGER.info("(With bar) Foo.bar = " + fooWithBar.getBar());
		Foo fooWithExtremeBar = ctx.getBean("myFooWithExtremeBar", Foo.class);
		LOGGER.info("(With extreme bar) Foo.bar = " + fooWithExtremeBar.getBar());
		((AnnotationConfigApplicationContext) ctx).close();
	}
}
