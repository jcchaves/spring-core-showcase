package me.juliochaves.tutorials.showcases.spring.core.di.replacemethod.beans;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.support.MethodReplacer;

public class ReplacementProcess implements MethodReplacer {
	private final static Log LOGGER = LogFactory
			.getLog(ReplacementProcess.class);

	@Override
	public Object reimplement(Object o, Method m, Object[] args)
			throws Throwable {
		LOGGER.info("Replacement process");
		return null;
	}

}
