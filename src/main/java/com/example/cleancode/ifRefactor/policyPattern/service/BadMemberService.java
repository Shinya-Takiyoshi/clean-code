package com.example.cleancode.ifRefactor.policyPattern.service;

import com.example.cleancode.ifRefactor.policyPattern.domain.model.PurchaseHistory;
import com.example.cleancode.ifRefactor.policyPattern.policy.GoldMemberPolicy;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BadMemberService {

    /**
     * gold会員かどうか
     **/
    public boolean isGoldMember(PurchaseHistory history) {
        if (100000 <= history.totalAmount) {
            if (10 <= history.purchaseFrequencyPerMonth) {
                if (history.returnRate <= 0.001) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * silver会員かどうか
     **/
    public boolean isSilverMember(PurchaseHistory history) {
        if (10 <= history.purchaseFrequencyPerMonth) {
            if (history.returnRate <= 0.001) {
                return true;
            }
        }
        return false;
    }
}

