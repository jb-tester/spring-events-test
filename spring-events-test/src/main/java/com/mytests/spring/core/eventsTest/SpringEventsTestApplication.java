package com.mytests.spring.core.eventsTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringEventsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEventsTestApplication.class, args);
    }

}
