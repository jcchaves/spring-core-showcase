package me.juliochaves.tutorials.showcases.spring.core.di.constructorbased;

import me.juliochaves.tutorials.showcases.spring.core.di.constructorbased.beans.dependent.Foo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
                "me/juliochaves/tutorials/showcases/spring/core/di/constructorbased/applicationContext.xml");
		Foo foo = context.getBean("foo", Foo.class);
		Foo fooWithConstructorNamedArgs = context.getBean(
				"fooWithConstructorNamedArgs", Foo.class);
		((ClassPathXmlApplicationContext) context).close();
	}
}
