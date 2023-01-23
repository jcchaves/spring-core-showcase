package me.juliochaves.tutorials.showcases.spring.core.postprocessors.beanpostprocessor;

import me.juliochaves.tutorials.showcases.spring.core.postprocessors.beanpostprocessor.messages.Messenger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(final String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "me/juliochaves/tutorials/showcases/spring/core/postprocessors/beanpostprocessor/applicationContext.xml");
		Messenger messenger = (Messenger) ctx.getBean("messenger");
		System.out.println(messenger);
		((ClassPathXmlApplicationContext) ctx).close();
	}
}
