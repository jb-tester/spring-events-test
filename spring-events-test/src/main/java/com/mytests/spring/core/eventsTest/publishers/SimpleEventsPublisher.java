package com.mytests.spring.core.eventsTest.publishers;

import com.mytests.spring.core.eventsTest.events.SimpleEvent;
import com.mytests.spring.core.eventsTest.events.SimpleEventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 10/10/2022.</p>
 * <p>Project: spring-events-test</p>
 * *
 */
@Component
public class SimpleEventsPublisher {

    @Autowired
    ApplicationEventPublisher publisher;

    @Schedules({@Scheduled(fixedRate = 10000)})
    public void publishEvents(){
        SimpleEventsService event1 = new SimpleEvent("event1");
        SimpleEventsService event2 = new SimpleEvent("event2");
        testConcreteType(new SimpleEvent("event3"));
        testBasicType(event1);
        testGeneric(event2);
    }
    void testConcreteType(SimpleEvent event){
        event.updateName("concrete");
        publisher.publishEvent(event);
    }
    void testBasicType(SimpleEventsService event) {
        event.updateName("base");
        publisher.publishEvent(event);
    }
    <T extends SimpleEventsService> void testGeneric(T event) {
        event.updateName("generic");
        publisher.publishEvent(event);
    }

}
