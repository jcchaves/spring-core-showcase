package me.juliochaves.tutorials.showcases.spring.core.di.beanmetadata;

import me.juliochaves.tutorials.showcases.spring.core.di.beanmetadata.beans.Foo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
                "me/juliochaves/tutorials/showcases/spring/core/di/beanmetadata/applicationContext.xml");
		Foo foo = context.getBean(Foo.class);
		LOGGER.info("Foo.bar = " + foo.getBar());
		LOGGER.info("Foo.extremeBar = " + foo.getExtremeBar());
		((ClassPathXmlApplicationContext) context).close();
	}
}
