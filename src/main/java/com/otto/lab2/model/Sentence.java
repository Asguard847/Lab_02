package com.otto.lab2.model;

import java.util.List;

public class Sentence {

    private List<Word> words;

    private int wordCount;

    public Sentence() {
    }

    public Sentence(List<Word> words, int wordCount) {
        this.words = words;
        this.wordCount = wordCount;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        for(Word word: words){
            stringBuilder.append(word + " ");
        }
        return stringBuilder.toString();
    }
}
