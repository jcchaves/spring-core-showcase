// from the file 'Messenger.groovy'
package me.juliochaves.tutorials.showcases.spring.core.postprocessors.beanpostprocessor.groovy;

// import the Messenger interface (written in Java) that is to be implemented

import me.juliochaves.tutorials.showcases.spring.core.postprocessors.beanpostprocessor.messages.Messenger

// define the implementation in Groovy
class GroovyMessenger implements Messenger {

    String message
}