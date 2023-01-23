/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.juliochaves.tutorials.showcases.spring.core.configuration.beansconfig.javaconfig.beans;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author macbookpro3
 */
public class Foo {

    private final static Log LOGGER = LogFactory.getLog(Foo.class);

    public Foo() {
        LOGGER.info("Creating new Foo");
    }

    @Override
    public String toString() {
        return "This is a foo";
    }
}
