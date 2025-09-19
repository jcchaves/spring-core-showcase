package me.juliochaves.tutorials.showcases.spring.core;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jHandler extends LogHandler<Level> {
	private final static Logger LOGGER = LogManager.getLogger(Log4jHandler.class);

	@Override
	protected void logImpl(Level logImplLevel, Object msg) {
		LOGGER.log(logImplLevel, msg);
	}
	
}