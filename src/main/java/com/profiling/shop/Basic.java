package com.profiling.shop;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Profile("basic")
public class Basic {
    Logger logger = Logger.getLogger(Basic.class.getName());

    @EventListener(ApplicationReadyEvent.class)
    private void get(){
        System.out.println("Basic shop version");
        logger.info("!!! INFO !!! Basic shop version");
    }
}
