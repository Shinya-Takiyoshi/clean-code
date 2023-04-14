package com.example.cleancode.liskovSubstitution;

public class DiscountTaxi implements Taxi {
    @Override
    public Money of() {
        return new Money(3000);
    }

    @Override
    public Money addLongFare() {
        return of().add(new Money(3000));
    }
}
