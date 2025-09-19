package me.juliochaves.tutorials.showcases.spring.core.di.lifecycle.postprocessor.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Foo {
	private final static Log LOGGER = LogFactory.getLog(Foo.class);

	@PostConstruct
	public void postConstruct() throws Exception {
		LOGGER.info("Foo: postConstruct called");
	}

	@PreDestroy
	public void preDestroy() throws Exception {
		LOGGER.info("Foo: preDestroy called");
	}
}
