package com.otto.lab2.service.impl;

import com.otto.lab2.model.Sentence;
import com.otto.lab2.model.Text;
import com.otto.lab2.service.OutputDisplayService;

import java.util.Collections;
import java.util.Comparator;


public class OutputDisplayConsoleService implements OutputDisplayService {

    @Override
    public void displayOutput(Text text) {

        Collections.sort(text.getSentences(), getWordCountComparator());
        System.out.println("Your sentences in ascending order by word counter: ");

        System.out.println(text);

    }

    private Comparator getWordCountComparator() {
        return Comparator.comparing(Sentence::getWordCount);
    }


}
