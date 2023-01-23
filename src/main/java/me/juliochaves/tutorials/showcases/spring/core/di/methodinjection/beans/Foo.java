package me.juliochaves.tutorials.showcases.spring.core.di.methodinjection.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class Foo {
	private final static Log LOGGER = LogFactory.getLog(Foo.class); 
	public Foo() {
	}

	public void process() {
		Bar bar = createBar();
		LOGGER.info(bar);
	}

	public abstract Bar createBar();

}
