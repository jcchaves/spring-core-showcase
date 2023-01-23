/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.juliochaves.tutorials.showcases.spring.core.configuration.hybrid;

import me.juliochaves.tutorials.showcases.spring.core.configuration.hybrid.config.AppConfigB;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author macbookpro3
 */
public class App {

    private static Log LOGGER = LogFactory.getLog(App.class);

    public static void main(String[] args) {
        LOGGER.info("Creating and starting container with configuration A");
        ApplicationContext ctxA = new ClassPathXmlApplicationContext(
                "me/juliochaves/tutorials/showcases/spring/core/configuration/hybrid/applicationContextA.xml");
        ((ClassPathXmlApplicationContext) ctxA).close();
        LOGGER.info("Creating and starting container with configuration B");
        ApplicationContext ctxB = new AnnotationConfigApplicationContext(
                AppConfigB.class);
        ((AnnotationConfigApplicationContext) ctxB).close();
    }
}
