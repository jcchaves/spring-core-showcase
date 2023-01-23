/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.juliochaves.tutorials.showcases.spring.core.configuration.beansconfig.hybrid;

import me.juliochaves.tutorials.showcases.spring.core.configuration.beansconfig.hybrid.beans.Bar;
import me.juliochaves.tutorials.showcases.spring.core.configuration.beansconfig.hybrid.beans.Foo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author macbookpro3
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("me/juliochaves/tutorials/showcases/spring/core/configuration/beansconfig/hybrid/applicationContext.xml");
        Foo foo = ctx.getBean(Foo.class);
        Bar bar = ctx.getBean(Bar.class);
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
