package com.example.cleancode.ifRefactor.policyPattern.policy;

import com.example.cleancode.ifRefactor.policyPattern.domain.model.PurchaseHistory;
import com.example.cleancode.ifRefactor.policyPattern.rules.ExcellentMemberRule;

import java.util.HashSet;
import java.util.Set;

public class ExcellentMemberPolicy {
    private final Set<ExcellentMemberRule> rules;

    ExcellentMemberPolicy() {
        rules = new HashSet<>();
    }

    void add(final ExcellentMemberRule rule) {
        rules.add(rule);
    }

    boolean complyWithAll(final PurchaseHistory history) {
        for (ExcellentMemberRule each : rules) {
            if (!each.ok(history)) return false;
        }
        return true;
    }
}
