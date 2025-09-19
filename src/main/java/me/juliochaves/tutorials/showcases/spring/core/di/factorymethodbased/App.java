package me.juliochaves.tutorials.showcases.spring.core.di.factorymethodbased;

import me.juliochaves.tutorials.showcases.spring.core.di.factorymethodbased.beans.dependent.Foo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
                "me/juliochaves/tutorials/showcases/spring/core/di/factorymethodbased/applicationContext.xml");
		context.getBean("foo", Foo.class);
		context.getBean("fooWithConstructorNamedArgs", Foo.class);
		((ClassPathXmlApplicationContext) context).close();
	}
}
