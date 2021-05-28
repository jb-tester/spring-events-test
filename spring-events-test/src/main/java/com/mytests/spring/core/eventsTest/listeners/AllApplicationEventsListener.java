package com.mytests.spring.core.eventsTest.listeners;

import com.mytests.spring.core.eventsTest.events.MyApplicationEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 28.05.2021.</p>
 * <p>Project: spring-events-test</p>
 * *
 */
@Component
public class AllApplicationEventsListener implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return true;
    }

    // no navigation from publisher to this listener - IDEA-270327
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
         if(applicationEvent instanceof MyApplicationEvent){
             System.out.println("**********************************");
             System.out.println("AllApplicationEventsListener: Got "+ ((MyApplicationEvent) applicationEvent).getText() + " " + applicationEvent.getTimestamp());
             System.out.println("**********************************");
         } else {
             System.out.println("**********************************");
             System.out.println("AllApplicationEventsListener: Got some application event " + applicationEvent.getClass().getName() + " " + applicationEvent.getTimestamp());
             System.out.println("**********************************");
         }
    }
}
