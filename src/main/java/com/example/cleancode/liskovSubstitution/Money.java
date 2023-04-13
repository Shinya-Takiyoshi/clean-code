package com.example.cleancode.liskovSubstitution;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Money {
    private final Integer amount;

    public Money add(Money money) {
        return new Money(this.amount + money.getAmount());
    }
}
