package com.example.cleancode.liskovSubstitution.execute;

import com.example.cleancode.liskovSubstitution.DiscountTaxi;
import com.example.cleancode.liskovSubstitution.LuxuryTaxi;
import com.example.cleancode.liskovSubstitution.Money;
import com.example.cleancode.liskovSubstitution.Taxi;

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
