package me.juliochaves.tutorials.showcases.spring.core;

import org.apache.logging.log4j.Level;

public abstract class AbstractAppWithLog4jSupport extends AbstractApp {
	public AbstractAppWithLog4jSupport() {
		setLogger(new Log4jHandler());
	}

	protected final void logInfo(Object msg) {
		getLogger().logImpl(Level.INFO, msg);
	}
}
