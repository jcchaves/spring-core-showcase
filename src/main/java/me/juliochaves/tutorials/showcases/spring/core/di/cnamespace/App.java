package me.juliochaves.tutorials.showcases.spring.core.di.cnamespace;

import me.juliochaves.tutorials.showcases.spring.core.di.cnamespace.beans.Foo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
                "me/juliochaves/tutorials/showcases/spring/core/di/cnamespace/applicationContext.xml");
		Foo foo = context.getBean("foo", Foo.class);
		Foo fooWithCNamespace = context.getBean("fooWithCNamespace", Foo.class);
		((ClassPathXmlApplicationContext) context).close();
	}
}
