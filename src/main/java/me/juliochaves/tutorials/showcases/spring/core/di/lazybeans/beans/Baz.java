package me.juliochaves.tutorials.showcases.spring.core.di.lazybeans.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Baz {
	private final static Log LOGGER = LogFactory.getLog(Baz.class);

	static {
		LOGGER.info("Baz class loaded");
	}

	public Baz() {
	}

	@Override
	public String toString() {
		return "It´s a baz";
	}
}
