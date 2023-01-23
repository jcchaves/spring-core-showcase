/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.juliochaves.tutorials.showcases.spring.core.configuration.hybrid.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigA {
    private static Log LOGGER = LogFactory.getLog(AppConfigA.class);

    {
        LOGGER.info("Configuration loaded from this class");
    }
}
