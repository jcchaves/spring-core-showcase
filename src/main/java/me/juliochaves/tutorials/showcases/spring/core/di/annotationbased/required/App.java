package me.juliochaves.tutorials.showcases.spring.core.di.annotationbased.required;

import me.juliochaves.tutorials.showcases.spring.core.di.annotationbased.required.beans.Foo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "me/juliochaves/tutorials/showcases/spring/core/di/annotationbased/required/applicationContext.xml");
		Foo foo = ctx.getBean("foo", Foo.class);
		LOGGER.info("Foo.bar = " + foo.getBar());
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
