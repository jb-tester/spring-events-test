package com.mytests.spring.core.eventsTest.listeners;

import com.mytests.spring.core.eventsTest.events.MyApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 28.05.2021.</p>
 * <p>Project: spring-events-test</p>
 * *
 */
@Component
public class MyApplicationEventsListener implements ApplicationListener<MyApplicationEvent> {
    @Override
    public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {
        System.out.println("**********************************");
        System.out.println("MyApplicationEventsListener: Got "+ (myApplicationEvent).getText() + " " + myApplicationEvent.getTimestamp());
        System.out.println("**********************************");
    }
}
