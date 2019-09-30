package com.otto.lab2.service.impl;

import com.otto.lab2.model.Sentence;
import com.otto.lab2.service.ParsingService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParsingServiceImpl implements ParsingService {

    @Override
    public List<Sentence> parseText(String input) {

        String splitRegEx = "((?<=\\.)|(?<=!)|(?<=\\?))";

        List<String> sentencesFromInput = Arrays.stream(input.split(splitRegEx)).
                map(s -> s.trim()).collect(Collectors.toList());

        List<Sentence> sentenceList = sentencesFromInput.stream().map(s -> {
            Sentence sentence = new Sentence();
            sentence.setContent(s);
            String[] words = s.split("\\s");
            sentence.setWordCounter(words.length);
            return sentence;
        }).collect(Collectors.toList());

        return sentenceList;
    }
}
