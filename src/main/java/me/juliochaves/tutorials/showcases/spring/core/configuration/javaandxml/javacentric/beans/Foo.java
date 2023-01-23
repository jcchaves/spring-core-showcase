package me.juliochaves.tutorials.showcases.spring.core.configuration.javaandxml.javacentric.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Foo {
	private final static Log LOGGER = LogFactory.getLog(Foo.class);
	private String bar;

	public Foo() {
		LOGGER.info("Creating new Foo");
	}

	public String getBar() {
		return bar;
	}

	public void setBar(String bar) {
		this.bar = bar;
	}

	@Override
	public String toString() {
		return "This is a foo";
	}
}
