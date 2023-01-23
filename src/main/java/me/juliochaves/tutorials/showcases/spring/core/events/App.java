package me.juliochaves.tutorials.showcases.spring.core.events;

import me.juliochaves.tutorials.showcases.spring.core.events.beans.EmailService;
import me.juliochaves.tutorials.showcases.spring.core.events.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
                //Custom event
		EmailService emailService = ctx.getBean(EmailService.class);
		emailService.sendEmail("john.doe@example.org", "Notification for John Doe");
		ctx.close();
	}
}
