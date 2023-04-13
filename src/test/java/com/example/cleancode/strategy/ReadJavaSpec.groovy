package com.example.cleancode.strategy

import spock.lang.Specification

class ReadJavaSpec extends Specification {
    def "#javaTypeの時は、#expectedである"() {
        given:
        ReadJava readJava = new ReadJava()
        expect:
        readJava.execute(javaType) == expected
        where:
        javaType || expected
        JavaType.JAVA_BRONZE || "JavaBronze"
        JavaType.JAVA_SILVER || "JavaSilver"
        JavaType.JAVA_GOLD   || "JavaGold"
    }
}
