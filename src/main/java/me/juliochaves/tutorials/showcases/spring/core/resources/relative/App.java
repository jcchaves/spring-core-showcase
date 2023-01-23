package me.juliochaves.tutorials.showcases.spring.core.resources.relative;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

public class App {
	private final static Log LOGGER = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		// Full classpath
		// ClassPathXmlApplicationContext ctx =
		// new ClassPathXmlApplicationContext("com/spring/tutorial/resources/dependencies/applicationContext.xml");
		// Relative classpath with Class argument
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext();
		// Absolute location (Loads as a UrlResource)
		Resource fileSystemAbsoluteResource = ctx
				.getResource("file:/Users/macbookpro3/Documents/projects/kepler64/spring-core/src/main/resources/com/spring/tutorial/resources/resourceloader/resources.xml");
		// Relative to working directory with or without leading slash (Loads as a FileSystemResource)
		Resource fileSystemRelativeResource = ctx
				.getResource("/src/main/resources/com/spring/tutorial/resources/resourceloader/resources.xml");
		LOGGER.info("FileSystemAbsoluteResource type: "	+ fileSystemAbsoluteResource.getClass());
		LOGGER.info("FileSystemAbsoluteResource exists? " + (fileSystemAbsoluteResource.exists() ? "Y" : "N"));
		LOGGER.info("FileSystemRelativeResource type: "	+ fileSystemRelativeResource.getClass());
		LOGGER.info("FileSystemRelativeResource exists? " + (fileSystemRelativeResource.exists() ? "Y" : "N"));
		ctx.close();
	}
}
