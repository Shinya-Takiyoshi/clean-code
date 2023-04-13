package com.example.cleancode.strategy;

public class ReadJava {
    public String execute(JavaType javaType) {
        //ストラテジーパターンを使えば、if分岐なしでenumとmapによる切り替えなどができる。
        JavaFactory javaFactory = new JavaFactory();
        final Java java = javaFactory.of(javaType);
        return java.show();
    }
}
