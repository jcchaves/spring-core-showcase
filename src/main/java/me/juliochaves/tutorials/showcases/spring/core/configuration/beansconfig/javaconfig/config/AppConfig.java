/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.juliochaves.tutorials.showcases.spring.core.configuration.beansconfig.javaconfig.config;

import me.juliochaves.tutorials.showcases.spring.core.configuration.beansconfig.javaconfig.beans.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author macbookpro3
 */
@Configuration
public class AppConfig {
    @Bean
    public Foo createFoo(){
        return new Foo();
    }
}
