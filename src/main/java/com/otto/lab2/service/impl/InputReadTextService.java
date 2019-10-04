package com.otto.lab2.service.impl;

import com.otto.lab2.service.InputReadService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.LinkedList;

public class InputReadTextService implements InputReadService {

    @Override
    public String readInput(String filePath) {

        /*StringBuilder sb = new StringBuilder();
        String line = null;
        InputStream inputStream = InputReadTextService.class.getResourceAsStream(filePath);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
            }
        }catch (IOException e) {
            throw new RuntimeException("Could not read file!");
        }

        return line;*/

        String content;
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            throw new RuntimeException("Could not read file!");
        }
        return content;
    }
}
