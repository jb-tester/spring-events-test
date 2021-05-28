package com.mytests.spring.core.eventsTest.publishers;

import com.mytests.spring.core.eventsTest.events.AnotherApplicationEvent;
import com.mytests.spring.core.eventsTest.events.MyApplicationEvent1;
import com.mytests.spring.core.eventsTest.events.MyApplicationEvent2;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 28.05.2021.</p>
 * <p>Project: spring-events-test</p>
 * *
 */
@Component
public class MyApplicationEventsPublisher {

    private final ApplicationEventPublisher publisher;

    public MyApplicationEventsPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @Scheduled(fixedRate = 1000000)
    public void publishEvents(){

        publisher.publishEvent(new MyApplicationEvent1(this,"hello!"));
        publisher.publishEvent(new MyApplicationEvent2(this,"bye!"));
        publisher.publishEvent(new AnotherApplicationEvent(this));
    }
}
