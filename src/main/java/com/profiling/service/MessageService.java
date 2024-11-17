package com.profiling.service;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MessageService {
    private final MessageSource messageSource;

    public MessageService(MessageSource messageSource) {
        this.messageSource = messageSource;
        String textEn = messageSource.getMessage(
                "hello"
                // indexes       0           1
                ,new Object[]{"Jarek", "Czaplicki"} // 2
                , Locale.ENGLISH

        );
        System.out.println(textEn);

        String textPL = messageSource.getMessage(
                "hello"
                ,new Object[]{"Chlebek", "", "", "", "", "", ""}
                , Locale.forLanguageTag("pl")

        );
        System.out.println(textPL);
Object[] objects = {};
        String textEE = messageSource.getMessage(
                "hello"
                ,new Object[]{"Kristina Lokko", "ja", "Raimond Olle"}
                , Locale.forLanguageTag("ee")

        );
        System.out.println(textEE);
    }
}
