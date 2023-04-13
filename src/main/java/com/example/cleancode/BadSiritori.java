package com.example.cleancode;

import lombok.NonNull;

public class BadSiritori {
    final String word;
    final String startWord;
    final String endWord;

    // どんな文字列でも渡せてしまう
    BadSiritori(String word, String startWord, String endWord) {
        this.word = word;
        this.startWord = startWord;
        this.endWord = endWord;
    }

    //どんな文字列が入るかわからない
    public boolean continueShiritori(@NonNull String s) {
        return endWord.equals(s);
    }
}
