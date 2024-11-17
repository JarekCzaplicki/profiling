package com.profiling.card.impl;

import com.profiling.card.Card;
import org.springframework.stereotype.Component;

//@Component("xxx")
@Component
public class VisaCard implements Card {
    @Override
    public String getName() {
        return "Visa Card";
    }
}
