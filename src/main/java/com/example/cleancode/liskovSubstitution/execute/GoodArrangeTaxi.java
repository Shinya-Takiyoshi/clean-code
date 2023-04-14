package com.example.cleancode.liskovSubstitution.execute;

import com.example.cleancode.liskovSubstitution.Money;
import com.example.cleancode.liskovSubstitution.Taxi;

public class GoodArrangeTaxi {

    //goodな理由:interfaceで分岐された処理をそれぞれのクラスで定義したことによって、分岐処理自体が不要になった！
    public Money execute(final Taxi taxi) {
        return taxi.addLongFare();
    }
}
