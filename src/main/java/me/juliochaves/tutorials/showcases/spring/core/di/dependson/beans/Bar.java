package me.juliochaves.tutorials.showcases.spring.core.di.dependson.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Bar {

	private final static Log LOGGER = LogFactory.getLog(Bar.class);

	static {
		LOGGER.info("Bar class loaded");
	}

	public Bar() {
	}

	@Override
	public String toString() {
		return "It´s a bar";
	}
}
