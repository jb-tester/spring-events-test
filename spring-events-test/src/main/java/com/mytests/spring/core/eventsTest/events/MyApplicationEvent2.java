package com.mytests.spring.core.eventsTest.events;

import org.springframework.context.ApplicationEvent;

/**
 * *
 * <p>Created by irina on 28.05.2021.</p>
 * <p>Project: spring-events-test</p>
 * *
 */
public class MyApplicationEvent2 extends MyApplicationEvent {

    private static final long serialVersionUID = 2L;
    public MyApplicationEvent2(Object source, String text) {
        super(source, text);
    }

}
