package com.example.cleancode.liskovSubstitution.execute

import com.example.cleancode.liskovSubstitution.DiscountTaxi
import com.example.cleancode.liskovSubstitution.LuxuryTaxi
import spock.lang.Specification

class GoodArrangeTaxiSpec extends Specification {
    def "GoodArrangeTaxi"() {
        given:
        GoodArrangeTaxi goodArrangeTaxi = new GoodArrangeTaxi()
        expect:
        goodArrangeTaxi.execute(taxi).getAmount() == expected
        where:
        taxi | expected
        new DiscountTaxi() | 6000
        new LuxuryTaxi()   | 11000
    }
}
