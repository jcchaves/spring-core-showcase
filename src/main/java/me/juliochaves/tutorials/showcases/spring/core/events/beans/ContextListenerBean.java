/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.juliochaves.tutorials.showcases.spring.core.events.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.lang.NonNull;

/**
 *
 * @author macbookpro3
 */
public class ContextListenerBean implements ApplicationListener<ContextRefreshedEvent>{
    private final static Log LOGGER = LogFactory.getLog(ContextListenerBean.class);
    @Override
    public void onApplicationEvent(@NonNull ContextRefreshedEvent e) {
        LOGGER.debug("Within contextListenerBean after the context has been initialized.");
    }
    
}
