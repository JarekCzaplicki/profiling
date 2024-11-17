package com.profiling.shop;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@Profile("premium")
public class Premium {
    Logger logger = LoggerFactory.getLogger(Premium.class.getName());

    @EventListener(ApplicationReadyEvent.class)
    private void get(){
        System.out.println("Premium shop version");
        logger.trace("!!! INFO !!! Premium shop version");
        logger.debug("!!! INFO !!! Premium shop version");
        logger.info("!!! INFO !!! Premium shop version");
        logger.warn("!!! INFO !!! Premium shop version");
        logger.error("!!! INFO !!! Premium shop version");
    }
}
