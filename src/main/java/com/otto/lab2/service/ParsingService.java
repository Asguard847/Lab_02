package com.otto.lab2.service;

import com.otto.lab2.model.Text;

/**
 * Class contains method for parsing input String contents to
 * a List of {@link com.otto.lab2.model.Sentence}
 */

public interface ParsingService {

    /**
     * Takes input String and parses it to a Text instance.
     *
     * @param input - input String to be parsed.
     * @return - {@link com.otto.lab2.model.Text}.
     */

    Text parseText(String input);

}
