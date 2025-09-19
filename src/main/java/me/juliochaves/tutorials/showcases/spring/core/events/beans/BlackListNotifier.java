package me.juliochaves.tutorials.showcases.spring.core.events.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.lang.NonNull;

public class BlackListNotifier implements ApplicationListener<BlackListEvent> {
	
	private final static Log LOGGER = LogFactory.getLog(BlackListNotifier.class);
	
	private String notificationAddress;

	public void setNotificationAddress(String notificationAddress) {
		this.notificationAddress = notificationAddress;
	}

	public void onApplicationEvent(@NonNull BlackListEvent event) {
		// notify appropriate parties via notificationAddress...
		LOGGER.info("On BlackListEvent");
	}
}
