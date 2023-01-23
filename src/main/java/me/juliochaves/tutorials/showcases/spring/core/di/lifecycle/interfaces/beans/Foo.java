package me.juliochaves.tutorials.showcases.spring.core.di.lifecycle.interfaces.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Foo implements InitializingBean, DisposableBean {
	private final static Log LOGGER = LogFactory.getLog(Foo.class);

	@Override
	public void afterPropertiesSet() throws Exception {
		LOGGER.info("Foo: afterProperties called");
	}

	@Override
	public void destroy() throws Exception {
		LOGGER.info("Foo: destroy called");
	}
}
