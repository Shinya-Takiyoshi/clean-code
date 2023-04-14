package com.example.cleancode.liskovSubstitution.execute

import com.example.cleancode.liskovSubstitution.DiscountTaxi
import com.example.cleancode.liskovSubstitution.LuxuryTaxi
import com.example.cleancode.liskovSubstitution.Taxi
import spock.lang.Specification

class BadArrangeTaxiSpec extends Specification {
    def "BadArrangeTaxi"() {
        given:
        BadArrangeTaxi badArrangeTaxi = new BadArrangeTaxi()
        expect:
        badArrangeTaxi.execute(taxi).getAmount() == expected
        where:
        taxi | expected
        new DiscountTaxi() | 6000
        new LuxuryTaxi()   | 11000
    }
}
