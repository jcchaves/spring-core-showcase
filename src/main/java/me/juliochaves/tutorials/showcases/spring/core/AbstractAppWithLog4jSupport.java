package me.juliochaves.tutorials.showcases.spring.core;

public abstract class AbstractAppWithLog4jSupport extends AbstractApp {
	public AbstractAppWithLog4jSupport() {
		setLogger(new Log4jHandler());
	}

	protected final void logInfo(Object msg) {
		getLogger().log(LogLevels.INFO, msg);
	}
}
