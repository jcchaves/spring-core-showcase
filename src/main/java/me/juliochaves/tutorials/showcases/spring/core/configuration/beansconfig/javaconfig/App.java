/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.juliochaves.tutorials.showcases.spring.core.configuration.beansconfig.javaconfig;

import me.juliochaves.tutorials.showcases.spring.core.configuration.beansconfig.javaconfig.beans.Foo;
import me.juliochaves.tutorials.showcases.spring.core.configuration.beansconfig.javaconfig.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author macbookpro3
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.getBean(Foo.class);
        ((AnnotationConfigApplicationContext) ctx).close();
    }
}
