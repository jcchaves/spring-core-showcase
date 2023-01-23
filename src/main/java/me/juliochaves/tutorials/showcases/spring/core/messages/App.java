/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.juliochaves.tutorials.showcases.spring.core.messages;

import java.util.Locale;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author macbookpro3
 */
public class App {

    private final static Log LOGGER = LogFactory.getLog(App.class);

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "me/juliochaves/tutorials/showcases/spring/core/messages/applicationContext.xml");
        MessageSource ms = ctx.getBean(MessageSource.class);
        //Message resolution
        String success = ms.getMessage("msg.success", null, Locale.getDefault());
        String successEN = ms.getMessage("msg.success", null, Locale.ENGLISH);
        String successFR = ms.getMessage("msg.success", null, Locale.FRENCH);
        String successDE = ms.getMessage("msg.success", null, Locale.GERMAN);
        //Message resolution and i18n
        String label = ms.getMessage("lbl.result", null, Locale.getDefault());
        //Not necessary to pass the locale
        String error = ms.getMessage("err.failure", null, null);
        //Non-existent message (if the call does not specify, the default message argument,
        //and the message code does not exist, an exception will be thrown)
        String nonExistent = ms.getMessage("my.message", null, "Not found, defaults to this message", null);
        LOGGER.info("Success message (es - the default): " + success);
        LOGGER.info("Success message (en): " + successEN);
        LOGGER.info("Success message (fr): " + successFR);
        LOGGER.info("Success message (de) defaults to local language: " + successDE);
        LOGGER.info("Label text: " + label);
        LOGGER.info("Error message: " + error);
        LOGGER.info("Non-existent message (defaults to message specified as argument): " + nonExistent);
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
