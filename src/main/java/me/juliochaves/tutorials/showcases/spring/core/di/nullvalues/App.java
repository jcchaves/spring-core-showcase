package me.juliochaves.tutorials.showcases.spring.core.di.nullvalues;

import me.juliochaves.tutorials.showcases.spring.core.di.nullvalues.beans.Foo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
                "me/juliochaves/tutorials/showcases/spring/core/di/nullvalues/applicationContext.xml");
		Foo foo = context.getBean("foo", Foo.class);
		LOGGER.info("Foo.bar = " + foo.getBar());
		Foo fooWithNullBar = context.getBean("fooWithNullBar", Foo.class);
		LOGGER.info("Foo.bar = " + fooWithNullBar.getBar());
		((ClassPathXmlApplicationContext) context).close();
	}
}
