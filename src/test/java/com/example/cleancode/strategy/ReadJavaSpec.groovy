package com.example.cleancode.strategy

import com.example.cleancode.strategy.execute.ReadJava
import spock.lang.Specification

class ReadJavaSpec extends Specification {
    def "#javaTypeの時は、#expectedである"() {
        given:
        JavaFactory javaFactory = new JavaFactory();
        ReadJava readJava = new ReadJava(javaFactory)
        expect:
        readJava.execute(javaType) == expected
        where:
        javaType || expected
        JavaType.JAVA_BRONZE || "JavaBronze"
        JavaType.JAVA_SILVER || "JavaSilver"
        JavaType.JAVA_GOLD   || "JavaGold"
    }
}
