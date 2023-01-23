package me.juliochaves.tutorials.showcases.spring.core.typeconversion;

import java.util.Date;

import me.juliochaves.tutorials.showcases.spring.core.typeconversion.beans.Foo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.format.support.FormattingConversionService;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "me/juliochaves/tutorials/showcases/spring/core/typeconversion/applicationContext.xml");

		FormattingConversionService convService = ctx.getBean(FormattingConversionService.class);
                
		LOGGER.info("Can convert from String to Foo? " + (convService.canConvert(String.class, Foo.class) ? "Y" : "N"));

		Foo foo = convService.convert("This is a bar", Foo.class);

		LOGGER.info("Foo.bar = " + foo.getBar());
		
		Date currentDate = new Date();
		
                String formattedDate = convService.convert(currentDate, String.class);
                
                LOGGER.info("Formatted date: " + formattedDate);
                
		ctx.close();
	}
}
