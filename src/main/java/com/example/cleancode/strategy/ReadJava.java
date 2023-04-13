package com.example.cleancode.strategy;

import java.util.HashMap;
import java.util.Map;

public class ReadJava {

    private final Map<JavaType, Java> javaTypes = new HashMap<>() {{
        put(JavaType.JAVA_BRONZE, new JavaBronze());
        put(JavaType.JAVA_SILVER, new JavaSilver());
        put(JavaType.JAVA_GOLD, new JavaGold());
    }};

    public String execute(JavaType javaType) {
        //ストラテジーパターンを使えば、if分岐なしでenumとmapによる切り替えなどができる。
        final Java java = javaTypes.get(javaType);
        return java.show();
    }
}
