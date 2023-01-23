package me.juliochaves.tutorials.showcases.spring.core.configuration.importing.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Foo {
	private final static Log LOGGER = LogFactory.getLog(Foo.class);

	public Foo() {
		LOGGER.info("Creating new Foo");
	}

	@Override
	public String toString() {
		return "This is a foo";
	}
}
