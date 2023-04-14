package com.example.cleancode.strategy.execute;

import com.example.cleancode.strategy.Java;
import com.example.cleancode.strategy.JavaFactory;
import com.example.cleancode.strategy.JavaType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ReadJava {
    private final JavaFactory javaFactory;

    public String execute(JavaType javaType) {
        //ストラテジーパターンを使えば、if分岐なしでenumとmapによる切り替えなどができる。
        final Java java = javaFactory.of(javaType);
        return java.show();
    }
}
