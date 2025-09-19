package me.juliochaves.tutorials.showcases.spring.core.di.beannameaware.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.lang.NonNull;

public class Foo implements BeanNameAware {
	private final static Log LOGGER = LogFactory.getLog(Foo.class);

	@Override
	public void setBeanName(@NonNull String name) {
		LOGGER.info("Foo bean name id: " + name);
	}

}
