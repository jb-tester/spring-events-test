package com.mytests.spring.core.eventsTest.listeners;

import com.mytests.spring.core.eventsTest.myannotations.AnotherApplicationEventListenerAnnotation;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 28.05.2021.</p>
 * <p>Project: spring-events-test</p>
 * *
 */
@Component
public class AnnotatedAnotherApplicationEventListener {

    // method is shown as unused - IDEA-270324
    // no navigation between listener and publisher - IDEA-270334
    @AnotherApplicationEventListenerAnnotation
    public void listenAnotherApplicationEvent(){
        System.out.println("**********************************");
        System.out.println("Custom annotation using: got AnotherApplicationEvent");
        System.out.println("**********************************");
    }
}
