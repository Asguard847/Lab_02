package com.otto.lab2.service.impl;

import com.otto.lab2.model.Sentence;
import com.otto.lab2.model.Text;
import com.otto.lab2.model.Word;
import com.otto.lab2.service.ParsingService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ParsingServiceImpl implements ParsingService {

    @Override
    public Text parseText(String input) {

        Text text = new Text();

        String splitSentenceRegEx = "((?<=\\.)|(?<=!)|(?<=\\?))";
        Pattern pattern = Pattern.compile(splitSentenceRegEx);
        String[] sentences = pattern.split(input);
        List<String> trimmedSentences = trimSentences(sentences);


        List<Sentence> sentenceList = trimmedSentences.stream().map(s -> {

            List<Word> wordList = new ArrayList<>();
            String[] stringWords = s.split("\\s");
            for (String stringWord : stringWords) {
                Word word = new Word(stringWord);
                wordList.add(word);
            }

            Sentence sentence = new Sentence(wordList, wordList.size());
            return sentence;

        }).collect(Collectors.toList());

        text.setSentences(sentenceList);

        return text;
    }

    private List<String> trimSentences(String[] input) {
        List<String> trimmedSentences = Arrays.stream(input).
                map(s -> s.trim()).
                collect(Collectors.toList());
        return trimmedSentences;
    }


}
