package com.example.cleancode.strategy;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class JavaFactory {
    private final Map<JavaType, Java> javaTypes = new HashMap<>() {{
        put(JavaType.JAVA_BRONZE, new JavaBronze());
        put(JavaType.JAVA_SILVER, new JavaSilver());
        put(JavaType.JAVA_GOLD, new JavaGold());
    }};

    public Java of(JavaType javaType) {
        //ストラテジーパターンを使えば、if分岐なしでenumとmapによる切り替えなどができる。
        return javaTypes.get(javaType);
    }
}
