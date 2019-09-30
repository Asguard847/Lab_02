package com.otto.lab2.service.impl;

import com.otto.lab2.model.Sentence;
import com.otto.lab2.service.OutputDisplayService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OutputDisplayConsoleService implements OutputDisplayService {

    @Override
    public void displayOutput(List<Sentence> input) {

        Collections.sort(input, Comparator.comparing(Sentence::getWordCounter));
        System.out.println("Your sentences in ascending order by word counter: ");

        StringBuilder sb = new StringBuilder();

        input.stream().forEach(sentence -> {
            sb.append("\n" + sentence.getContent() + "\nwords: " + sentence.getWordCounter());
        });

        System.out.println(sb.toString());

    }


}
