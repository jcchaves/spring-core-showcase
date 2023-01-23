package me.juliochaves.tutorials.showcases.spring.core.di.setterbased;

import me.juliochaves.tutorials.showcases.spring.core.di.setterbased.beans.dependent.Foo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
                "me/juliochaves/tutorials/showcases/spring/core/di/setterbased/applicationContext.xml");
		Foo foo = context.getBean("foo", Foo.class);
		((ClassPathXmlApplicationContext) context).close();
	}
}
