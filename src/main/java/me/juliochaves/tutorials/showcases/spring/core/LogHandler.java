package me.juliochaves.tutorials.showcases.spring.core;

public abstract class LogHandler<LogImplLevel> {

	protected abstract void logImpl(LogImplLevel logImplLevel, Object msg);
}
