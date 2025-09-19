package me.juliochaves.tutorials.showcases.spring.core;

public abstract class AbstractApp {
	protected Log4jHandler logger;

	public Log4jHandler getLogger() {
		return logger;
	}

	public void setLogger(Log4jHandler logger) {
		this.logger = logger;
	}

	protected abstract void main();
}
