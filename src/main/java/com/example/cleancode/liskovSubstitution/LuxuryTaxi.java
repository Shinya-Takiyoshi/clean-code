package com.example.cleancode.liskovSubstitution;

public class LuxuryTaxi implements Taxi{
    @Override
    public Money of() {
        return new Money(5000);
    }

    @Override
    public Money addLongFare() {
        return of().add(new Money(6000));
    }
}
