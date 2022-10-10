package com.mytests.spring.core.eventsTest.listeners;

import com.mytests.spring.core.eventsTest.events.SimpleEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 10/10/2022.</p>
 * <p>Project: spring-events-test</p>
 * *
 */
@Component
public class SimpleEventListeners {
    @EventListener
    public void listener(SimpleEvent event) {
        System.out.println("simple event "+event.getName()+"was caught");
    }
}
