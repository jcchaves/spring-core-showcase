package me.juliochaves.tutorials.showcases.spring.core.postprocessors.propertyoverride;

import me.juliochaves.tutorials.showcases.spring.core.postprocessors.propertyoverride.beans.Foo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(final String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "me/juliochaves/tutorials/showcases/spring/core/postprocessors/propertyoverride/applicationContext.xml");
		Foo foo = ctx.getBean("foo", Foo.class);
		LOGGER.info("Foo.bar = " + foo.getBar());
		LOGGER.info("Foo.baz = " + foo.getBaz());
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
