package com.mytests.spring.core.eventsTest.myannotations;

import com.mytests.spring.core.eventsTest.events.AnotherApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * *
 * <p>Created by irina on 28.05.2021.</p>
 * <p>Project: spring-events-test</p>
 * *
 */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@EventListener(AnotherApplicationEvent.class)
public @interface AnotherApplicationEventListenerAnnotation {



    @AliasFor(
            annotation = EventListener.class,
            attribute = "condition"
    )
    String condition() default "";

    @AliasFor(
            annotation = EventListener.class,
            attribute = "id"
    )
    String id() default "";
}
