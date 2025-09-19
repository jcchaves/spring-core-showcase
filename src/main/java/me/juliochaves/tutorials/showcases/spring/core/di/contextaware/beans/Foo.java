package me.juliochaves.tutorials.showcases.spring.core.di.contextaware.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.NonNull;

public class Foo implements ApplicationContextAware {
	private final static Log LOGGER = LogFactory.getLog(Foo.class);

	@Override
	public void setApplicationContext(@NonNull ApplicationContext applicationContext)
			throws BeansException {
		LOGGER.info("Foo applicationContext id: " + applicationContext.getId());
	}

}
