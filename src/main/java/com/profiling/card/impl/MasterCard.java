package com.profiling.card.impl;

import com.profiling.card.Card;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MasterCard implements Card {
    @Override
    public String getName() {
        return "Master Card";
    }
}
