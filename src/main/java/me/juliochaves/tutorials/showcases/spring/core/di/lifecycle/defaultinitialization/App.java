package me.juliochaves.tutorials.showcases.spring.core.di.lifecycle.defaultinitialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
                "me/juliochaves/tutorials/showcases/spring/core/di/lifecycle/defaultinitialization/applicationContext.xml");
		((ClassPathXmlApplicationContext) context).close();
	}
}
