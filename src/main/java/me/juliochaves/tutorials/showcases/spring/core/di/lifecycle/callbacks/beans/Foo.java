package me.juliochaves.tutorials.showcases.spring.core.di.lifecycle.callbacks.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Foo {
	private final static Log LOGGER = LogFactory.getLog(Foo.class);

	public void init() {
		LOGGER.info("Foo: init called");
	}

	public void destroy() {
		LOGGER.info("Foo: destroy called");
	}
}
