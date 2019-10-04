package com.otto.lab2.service.impl;

import com.otto.lab2.service.InputReadService;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class InputReadTextServiceTest {

    InputReadService inputReadService = new InputReadTextService();

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testInputReaderSuccess() {
        String input = inputReadService.readInput("src/main/resources/input.txt");
        assertNotNull(input);
    }

    @Test
    public void testInputReaderFailure() {
        exception.expect(RuntimeException.class);
        exception.expectMessage("Could not read file!");
        inputReadService.readInput("aaa.txt");
    }


}