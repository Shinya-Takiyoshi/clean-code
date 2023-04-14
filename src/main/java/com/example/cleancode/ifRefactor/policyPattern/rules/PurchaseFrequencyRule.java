package com.example.cleancode.ifRefactor.policyPattern.rules;

import com.example.cleancode.ifRefactor.policyPattern.domain.model.PurchaseHistory;

public class PurchaseFrequencyRule implements ExcellentMemberRule {
    /**
     * @param history 購入履歴
     * @return 条件を満たす場合true
     **/
    @Override
    public boolean ok(PurchaseHistory history) {
        return 10 <= history.purchaseFrequencyPerMonth;
    }
}
