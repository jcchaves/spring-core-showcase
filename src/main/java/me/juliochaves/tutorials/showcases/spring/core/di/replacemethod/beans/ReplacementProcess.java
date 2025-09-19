package me.juliochaves.tutorials.showcases.spring.core.di.replacemethod.beans;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.lang.NonNull;

public class ReplacementProcess implements MethodReplacer {
	private final static Log LOGGER = LogFactory
			.getLog(ReplacementProcess.class);

	@Override
	public @NonNull Object reimplement(@NonNull Object o, @NonNull Method m, @NonNull Object[] args)
			throws Throwable {
		LOGGER.info("Replacement process");
		return new Object(); // Return a non-null object instead of null
	}

}
