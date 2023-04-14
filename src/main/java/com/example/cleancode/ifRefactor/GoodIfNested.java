package com.example.cleancode.ifRefactor;

import com.example.cleancode.liskovSubstitution.DiscountTaxi;
import com.example.cleancode.liskovSubstitution.LuxuryTaxi;
import com.example.cleancode.liskovSubstitution.Money;
import com.example.cleancode.liskovSubstitution.Taxi;

public class GoodIfNested {
    // 早期リターンを意識することで、ifのネストがなくなり可読性が向上する
    public void execute(int amount) {
        if (amount <= 0) return;
        System.out.println("1以上である");
        if (amount < 100) return;
        System.out.println("100以上である");
        if (amount == 200) return;
        System.out.println("200である");
    }

    //都度returnしてしまえば、elseやelseifが不要になり可読性向上
    //最後にデフォルトのreturnを用意する
    public Money execute1(final Taxi taxi) {
        if (taxi instanceof DiscountTaxi) return taxi.of().add(new Money(3000));
        if (taxi instanceof LuxuryTaxi) return taxi.of().add(new Money(6000));
        return taxi.of().add(new Money(0));
    }
}
