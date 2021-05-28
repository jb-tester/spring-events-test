package com.mytests.spring.core.eventsTest.events;

import org.springframework.context.ApplicationEvent;

/**
 * *
 * <p>Created by irina on 28.05.2021.</p>
 * <p>Project: spring-events-test</p>
 * *
 */
public class AnotherApplicationEvent extends ApplicationEvent {
    public AnotherApplicationEvent(Object source) {
        super(source);
    }
}
