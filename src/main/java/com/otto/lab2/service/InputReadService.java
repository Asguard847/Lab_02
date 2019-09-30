package com.otto.lab2.service;

/**
 * Class contains method for reading contents of a file by
 * file path String.
 */

public interface InputReadService {

    /**
     * Reads contents of a file by file path
     *
     * @param filePath - file path
     * @return - contents of a file in a String
     */

    String readInput(String filePath);

}

