package com.example.cleancode.strategy;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Getter
public enum JavaType {
    JAVA_BRONZE("JavaBronze"),
    JAVA_SILVER("JavaSilver"),
    JAVA_GOLD("JavaGold");
    private final String className;
}

