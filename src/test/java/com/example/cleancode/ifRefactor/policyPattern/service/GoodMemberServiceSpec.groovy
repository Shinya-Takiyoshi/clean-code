package com.example.cleancode.ifRefactor.policyPattern.service

import com.example.cleancode.ifRefactor.policyPattern.domain.model.PurchaseHistory
import com.example.cleancode.ifRefactor.policyPattern.policy.GoldMemberPolicy
import com.example.cleancode.ifRefactor.policyPattern.policy.SilverMemberPolicy
import spock.lang.Shared
import spock.lang.Specification

class GoodMemberServiceSpec extends Specification {
    @Shared
    private GoldMemberPolicy goldMemberPolicy
    @Shared
    private SilverMemberPolicy silverMemberPolicy

    def setupSpec(){
        goldMemberPolicy = new GoldMemberPolicy()
        silverMemberPolicy = new SilverMemberPolicy()
    }

    def "IsGoldMember[#testCase]"() {
        given:
        PurchaseHistory history = Mock(PurchaseHistory)
        history.totalAmount = totalAmount
        history.purchaseFrequencyPerMonth = purchaseFrequencyPerMonth
        history.returnRate = returnRate

        GoodMemberService goodMemberService = new GoodMemberService(goldMemberPolicy,silverMemberPolicy)

        expect:
        goodMemberService.isGoldMember(history) == expected

        where:
        testCase | totalAmount | purchaseFrequencyPerMonth | returnRate || expected
        "全条件true"|100001 | 11 | 0.001 || true
        "全条件true かつ totalAmount閾値内"|100000 | 11 | 0.001 || true
        "totalAmount閾値外"|99999 | 11 | 0.001 || false
        "purchaseFrequencyPerMonth閾値内"|100000 | 10 | 0.001 || true
        "purchaseFrequencyPerMonth閾値外"|100000 | 9 | 0.001 || false
        "returnRate閾値内"|100000 | 11 | 0.0009 || true
        "returnRate閾値外"|100000 | 11 | 0.002 || false
    }

    def "IsSilverMember[#testCase]"() {
        given:
        PurchaseHistory history = Mock(PurchaseHistory)
        history.totalAmount = totalAmount
        history.purchaseFrequencyPerMonth = purchaseFrequencyPerMonth
        history.returnRate = returnRate

        GoodMemberService goodMemberService = new GoodMemberService(goldMemberPolicy,silverMemberPolicy)

        expect:
        goodMemberService.isSilverMember(history) == expected

        where:
        testCase | totalAmount | purchaseFrequencyPerMonth | returnRate || expected
        "全条件true"|100001 | 11 | 0.001 || true
        "全条件true かつ totalAmount閾値内"|100000 | 11 | 0.001 || true
        "totalAmount閾値外"|99999 | 11 | 0.001 || true
        "purchaseFrequencyPerMonth閾値内"|100000 | 10 | 0.001 || true
        "purchaseFrequencyPerMonth閾値外"|100000 | 9 | 0.001 || false
        "returnRate閾値内"|100000 | 11 | 0.0009 || true
        "returnRate閾値外"|100000 | 11 | 0.002 || false
    }
}
