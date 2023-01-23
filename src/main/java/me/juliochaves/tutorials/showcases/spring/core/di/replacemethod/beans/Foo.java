package me.juliochaves.tutorials.showcases.spring.core.di.replacemethod.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Foo {
	private final static Log LOGGER = LogFactory.getLog(Foo.class);

	public Foo() {
	}

	public void process() {
		LOGGER.info("Normal process");
	}

}
