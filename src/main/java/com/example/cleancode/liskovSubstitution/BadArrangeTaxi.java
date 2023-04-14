package com.example.cleancode.liskovSubstitution;

public class BadArrangeTaxi {

    //badな理由:せっかくinterfaceで定義したのに、型チェックの分岐が発生してしまっている
    public Money execute(final Taxi taxi){
        Money busyAddFare = null;
        if(taxi instanceof DiscountTaxi){
            busyAddFare = taxi.of().add(new Money(3000));
        }else if(taxi instanceof LuxuryTaxi){
            busyAddFare = taxi.of().add(new Money(6000));
        }
        return busyAddFare;
    }
}
