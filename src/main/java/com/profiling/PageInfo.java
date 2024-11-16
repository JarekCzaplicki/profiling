package com.profiling;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "page-info")
public class PageInfo {
//    @Value("${page_info.author}")
    private String author; // null
//    @Value("${page_info.date}")
    private int creationDate; // 0

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void print(){
        System.out.println("Author: " + author);
        System.out.println("Creation date: " + creationDate);
    }
}
