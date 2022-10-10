package com.mytests.spring.core.eventsTest.events;

/**
 * *
 * <p>Created by irina on 10/10/2022.</p>
 * <p>Project: spring-events-test</p>
 * *
 */
public class SimpleEvent implements SimpleEventsService {


    @Override
    public void updateName(String str) {
        this.name = this.name+"_"+str;
    }

    public SimpleEvent(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String getName() {
        return this.name;
    }
}
