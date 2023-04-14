package com.example.cleancode.ifRefactor.policyPattern.rules;

import com.example.cleancode.ifRefactor.policyPattern.domain.model.PurchaseHistory;

public interface ExcellentMemberRule {
    /**
     * @param history 購入履歴
     * @return 条件を満たす場合true
     **/
    boolean ok(final PurchaseHistory history);

}
