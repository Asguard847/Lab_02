package com.otto.lab2.service;

import com.otto.lab2.model.Sentence;

import java.util.List;

/**
 * Class contains method for parsing input String contents to
 * a List of {@link com.otto.lab2.model.Sentence}
 */

public interface ParsingService {

    /**
     * Takes input String and parses it to a list of Sentences.
     * Each sentence has its contents in a String and wordCounter -
     * number of words in this sentence.
     *
     * @param input - input String to be parsed.
     * @return - List of {@link com.otto.lab2.model.Sentence}.
     */

    List<Sentence> parseText(String input);

}
