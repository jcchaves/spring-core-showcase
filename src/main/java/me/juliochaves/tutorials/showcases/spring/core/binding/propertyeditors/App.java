package me.juliochaves.tutorials.showcases.spring.core.binding.propertyeditors;

import me.juliochaves.tutorials.showcases.spring.core.binding.propertyeditors.beans.Foo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"me/juliochaves/tutorials/showcases/spring/core/binding/propertyeditors/applicationContext.xml");
		Foo foo = ctx.getBean(Foo.class);
		LOGGER.info("Foo.name = " + foo.getName());
		LOGGER.info("Foo.date = " + foo.getDate());
		ctx.close();
	}
}
