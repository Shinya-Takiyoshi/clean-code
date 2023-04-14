package com.example.cleancode.ifRefactor.policyPattern.service;

import com.example.cleancode.ifRefactor.policyPattern.domain.model.PurchaseHistory;
import com.example.cleancode.ifRefactor.policyPattern.policy.GoldMemberPolicy;
import com.example.cleancode.ifRefactor.policyPattern.policy.SilverMemberPolicy;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GoodMemberService {
    private final GoldMemberPolicy goldMemberPolicy;
    private final SilverMemberPolicy silverMemberPolicy;
    /**
     * gold会員かどうか
     **/
    public boolean isGoldMember(PurchaseHistory history) {
        //ポリシーパターンを使うことによって呼び出し処理が簡潔になり可読性向上
        return goldMemberPolicy.complyWithAll(history);
    }

    /**
     * silver会員かどうか
     **/
    public boolean isSilverMember(PurchaseHistory history) {
        //ポリシーパターンを使うことによって呼び出し処理が簡潔になり可読性向上
        return silverMemberPolicy.complyWithAll(history);
    }
}

