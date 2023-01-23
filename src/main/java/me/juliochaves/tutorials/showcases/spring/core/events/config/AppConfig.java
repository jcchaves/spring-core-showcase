package me.juliochaves.tutorials.showcases.spring.core.events.config;

import java.util.ArrayList;
import java.util.List;

import me.juliochaves.tutorials.showcases.spring.core.events.beans.BlackListEvent;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.juliochaves.tutorials.showcases.spring.core.events.beans.BlackListNotifier;
import me.juliochaves.tutorials.showcases.spring.core.events.beans.ContextListenerBean;
import me.juliochaves.tutorials.showcases.spring.core.events.beans.EmailService;
import org.springframework.context.event.ContextRefreshedEvent;

@Configuration
public class AppConfig {

    @Bean
    public ApplicationEventPublisherAware createEmailService() {
        EmailService emailService = new EmailService();
        List<String> blackList = new ArrayList<String>();
        blackList.add("john.doe@example.org");
        emailService.setBlackList(blackList);
        return emailService;
    }

    @Bean
    public ApplicationListener<BlackListEvent> createBlackListNotifier() {
        BlackListNotifier blackListNotifier = new BlackListNotifier();
        blackListNotifier.setNotificationAddress("blacklist@example.org");
        return blackListNotifier;
    }

    @Bean
    public ApplicationListener<ContextRefreshedEvent> createContextListener() {
        ContextListenerBean ctxListener = new ContextListenerBean();
        return ctxListener;
    }
}
