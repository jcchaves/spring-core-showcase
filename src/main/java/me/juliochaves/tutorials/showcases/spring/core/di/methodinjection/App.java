package me.juliochaves.tutorials.showcases.spring.core.di.methodinjection;

import me.juliochaves.tutorials.showcases.spring.core.di.methodinjection.beans.Foo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
                "me/juliochaves/tutorials/showcases/spring/core/di/methodinjection/applicationContext.xml");
		Foo foo = context.getBean("foo", Foo.class);
		foo.process();
		((ClassPathXmlApplicationContext) context).close();
	}
}
