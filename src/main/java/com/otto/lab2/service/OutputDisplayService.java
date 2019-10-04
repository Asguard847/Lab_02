package com.otto.lab2.service;

import com.otto.lab2.model.Sentence;
import com.otto.lab2.model.Text;

import java.util.List;

/**
 * Class has method for displaying output data to console
 * in user readable manner.
 */

public interface OutputDisplayService {

    /**
     * Outputs to console each {@link com.otto.lab2.model.Sentence}
     * in ascending order by number of words.
     *
     * @param {@link com.otto.lab2.model.Text}.
     */

    void displayOutput(Text text);
}
