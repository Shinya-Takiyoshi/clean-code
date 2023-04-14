package com.example.cleancode.ifRefactor.policyPattern.policy;

import com.example.cleancode.ifRefactor.policyPattern.domain.model.PurchaseHistory;
import com.example.cleancode.ifRefactor.policyPattern.rules.PurchaseFrequencyRule;
import com.example.cleancode.ifRefactor.policyPattern.rules.ReturnRateRule;

public class SilverMemberPolicy {
    private final ExcellentMemberPolicy policy;

    public SilverMemberPolicy() {
        //追加や削除された場合、条件を編集するだけ
        policy = new ExcellentMemberPolicy();
        policy.add(new PurchaseFrequencyRule());
        policy.add(new ReturnRateRule());
    }

    public boolean complyWithAll(final PurchaseHistory history) {
        return policy.complyWithAll(history);
    }
}
