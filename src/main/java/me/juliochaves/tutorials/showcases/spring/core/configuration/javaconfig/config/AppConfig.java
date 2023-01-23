/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.juliochaves.tutorials.showcases.spring.core.configuration.javaconfig.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    private static Log LOGGER = LogFactory.getLog(AppConfig.class);

    {
        LOGGER.info("Configuration loaded from this class");
    }
}
