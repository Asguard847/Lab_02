package com.otto.lab2;

import com.otto.lab2.model.Sentence;
import com.otto.lab2.model.Text;
import com.otto.lab2.service.InputReadService;
import com.otto.lab2.service.OutputDisplayService;
import com.otto.lab2.service.ParsingService;
import com.otto.lab2.service.impl.InputReadTextService;
import com.otto.lab2.service.impl.OutputDisplayConsoleService;
import com.otto.lab2.service.impl.ParsingServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {

        InputReadService inputReadService = new InputReadTextService();
        ParsingService parsingService = new ParsingServiceImpl();
        OutputDisplayService outputDisplayService = new OutputDisplayConsoleService();

        String input = inputReadService.readInput("src/main/resources/input.txt");
        Text text = parsingService.parseText(input);
        outputDisplayService.displayOutput(text);

    }
}
