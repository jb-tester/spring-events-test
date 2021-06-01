package com.mytests.spring.core.eventsTest.listeners;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 28.05.2021.</p>
 * <p>Project: spring-events-test</p>
 * *
 */
@Component
public class SystemEventsListener {

    @EventListener // navigation to org.springframework.context.support.AbstractApplicationContext.finishRefresh() works
    public void listenContextRefreshedEvent(ContextRefreshedEvent event){
        System.out.println("**********************************");
        System.out.println("got ContextRefreshedEvent");
        System.out.println("**********************************");
    }

    @EventListener(ApplicationStartedEvent.class) // navigation to org.springframework.boot.context.event.EventPublishingRunListener.started() works
    public void listenApplicationStartedEvent(){
        System.out.println("**********************************");
        System.out.println("got ApplicationStartedEvent");
        System.out.println("**********************************");
    }
}
