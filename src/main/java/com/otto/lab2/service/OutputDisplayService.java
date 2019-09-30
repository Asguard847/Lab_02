package com.otto.lab2.service;

import com.otto.lab2.model.Sentence;

import java.util.List;

/**
 * Class has method for displaying output data to console
 * in user readable manner.
 */

public interface OutputDisplayService {

    /**
     * Outputs to console each {@link com.otto.lab2.model.Sentence}
     * in ascending order by number of words with nuber of words counter.
     *
     * @param input List of {@link com.otto.lab2.model.Sentence}.
     */

    void displayOutput(List<Sentence> input);
}
