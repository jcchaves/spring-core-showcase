package me.juliochaves.tutorials.showcases.spring.core;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Log4jHandler extends LogHandler<Level> {
	private final static Logger LOGGER = Logger.getLogger(Log4jHandler.class);

	@Override
	protected Level mapLogLevels(LogLevels logLevel) {
		Level level = Level.ERROR;
		switch (logLevel) {
		case TRACE:
			level = Level.TRACE;
			break;
		case DEBUG:
			level = Level.DEBUG;
			break;
		case INFO:
			level = Level.INFO;
			break;
		case WARNING:
			level = Level.WARN;
			break;
		default:
			level = Level.ERROR;
		}
		return level;
	}

	@Override
	protected void logImpl(Level logImplLevel, Object msg) {
		LOGGER.log(logImplLevel, msg);
	}
}