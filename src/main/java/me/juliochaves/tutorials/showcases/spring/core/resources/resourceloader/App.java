package me.juliochaves.tutorials.showcases.spring.core.resources.resourceloader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		Resource classPathResource = ctx
				.getResource("classpath:com/spring/tutorial/resources/resourceloader/resources.xml");
		Resource fileSystemResource = ctx
				.getResource("file:src/main/resources/com/spring/tutorial/resources/resourceloader/resources.xml");
		Resource urlResource = ctx.getResource("http://googlelatin.com/tmp/stronger.gif");
		LOGGER.info("ClassPathResource type: " + classPathResource.getClass());
		LOGGER.info("ClassPathResource exists? " + (classPathResource.exists() ? "Y" : "N"));
		LOGGER.info("FileSystemResource type: " + fileSystemResource.getClass());
		LOGGER.info("FileSystemResource exists? " + (fileSystemResource.exists() ? "Y" : "N"));
		LOGGER.info("UrlResource type: " + urlResource.getClass());
		LOGGER.info("UrlResource exists? " + (urlResource.exists() ? "Y" : "N"));
		ctx.close();
	}
}