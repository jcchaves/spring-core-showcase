package me.juliochaves.tutorials.showcases.spring.core.di.beanmetadata.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FactoryMethodComponent {
	private final static Log LOGGER = LogFactory
			.getLog(FactoryMethodComponent.class);

	@Bean @Qualifier("normal")
	public Bar produceBarInstance() {
		LOGGER.info("Creating bar object in factory method component");
		return new Bar();
	}
	
	@Bean @Qualifier("extreme")
	public Bar produceBarExtremeInstance() {
		LOGGER.info("Creating extreme bar object in factory method component");
		return new Bar();
	}
}
