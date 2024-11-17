package com.profiling;

import com.profiling.card.Card;
import com.profiling.card.CardService;
import com.profiling.card.impl.MasterCard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class ProfilingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProfilingApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void welcomePage(){
        System.out.println("Welcome to Profiling");
    }


    // internationalization = i18n
    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:i18n/messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
