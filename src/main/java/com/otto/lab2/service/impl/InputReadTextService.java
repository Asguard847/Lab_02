package com.otto.lab2.service.impl;

import com.otto.lab2.service.InputReadService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InputReadTextService implements InputReadService {

    @Override
    public String readInput(String filePath) {
        String content;
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            throw new RuntimeException("Could not read file!");
        }
        return content;
    }
}
