package com.profiling.card;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    public final Card card;

    public CardService(@Qualifier("visaCard") Card card) {
        this.card = card;
        System.out.println(card.getName());
    }

}
