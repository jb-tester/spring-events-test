package com.mytests.spring.core.eventsTest.listeners;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * *
 * <p>Created by irina on 28.05.2021.</p>
 * <p>Project: spring-events-test</p>
 * *
 */
@Component
public class AnnotatedAllEventsListener {

    @EventListener//(classes = ApplicationEvent.class)
    public void handleAllEvents(ApplicationEvent event){
        System.out.println("**********************************");
        System.out.println("AnnotatedAllEventsListener.handleAllEvents: got "+event.getClass().getName());
        System.out.println("**********************************");
    }

    // method is shown as unused - IDEA-270324 - fixed
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMPLETION)
    public void handleAllEventsAfterCompletion(ApplicationEvent event){
        System.out.println("**********************************");
        System.out.println("AnnotatedAllEventsListener.handleAllEventsAfterCompletion: got "+event.getClass().getName());
        System.out.println("**********************************");
    }

}
