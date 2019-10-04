package com.otto.lab2.model;

import java.util.List;

public class Text {

    private List<Sentence> sentences;

    public Text() {
    }

    public Text(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        for(Sentence sentence: sentences){
            stringBuilder.append("\n");
            stringBuilder.append(sentence);
        }
        return stringBuilder.toString();
    }
}
