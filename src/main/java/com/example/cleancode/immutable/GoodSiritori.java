package com.example.cleancode.immutable;

import lombok.NonNull;

import java.util.regex.Pattern;

public class GoodSiritori {
    String word;
    String startWord;
    String endWord;

    // 英数字を排除したい場合に、完全コンストラクタで除外する
    GoodSiritori(String word, String startWord, String endWord) {
        Pattern p = Pattern.compile("^[\\p{Alnum}|\\p{Punct}]*$");
        if (p.matcher(word).find()) {
            throw new IllegalStateException("英数字が使われています");
        }
        this.word = word;
        this.startWord = startWord;
        this.endWord = endWord;
    }

    //型で固定した方が想定外の値の混入を防ぐことができる
    public boolean continueShiritori(@NonNull final GoodSiritori s) {
        return endWord.equals(s.startWord);
    }
}
