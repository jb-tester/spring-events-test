package com.mytests.spring.core.eventsTest.events;

import org.springframework.context.ApplicationEvent;

/**
 * *
 * <p>Created by irina on 28.05.2021.</p>
 * <p>Project: spring-events-test</p>
 * *
 */
public class MyApplicationEvent extends ApplicationEvent {
    String text;

    public MyApplicationEvent(Object source, String text) {
        super(source);
        this.text = this.getClass().getName()+" with "+text;
    }

    public String getText() {
        return text;
    }
}
