package com.example.cleancode.ifRefactor;

import com.example.cleancode.liskovSubstitution.DiscountTaxi;
import com.example.cleancode.liskovSubstitution.LuxuryTaxi;
import com.example.cleancode.liskovSubstitution.Money;
import com.example.cleancode.liskovSubstitution.Taxi;

public class BadIfNested {
    public void execute(int amount) {
        if (amount > 0) {
            System.out.println("1以上である");
           if(amount > 100){
               System.out.println("100以上である");
               if(amount == 200){
                   System.out.println("200である");
               }
           }
        }
    }

    public Money execute1(final Taxi taxi) {
        Money busyAddFare = null;
        if (taxi instanceof DiscountTaxi) {
            busyAddFare = taxi.of().add(new Money(3000));
        } else if (taxi instanceof LuxuryTaxi) {
            busyAddFare = taxi.of().add(new Money(6000));
        }
        return busyAddFare;
    }
}
