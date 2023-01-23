package me.juliochaves.tutorials.showcases.spring.core.configuration.javaandxml.xmlcentric.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Foo {
	private final static Log LOGGER = LogFactory.getLog(Foo.class);
	private Bar bar;

	public Foo() {
		LOGGER.info("Creating new Foo");
	}

	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	@Override
	public String toString() {
		return "This is a foo";
	}
}
