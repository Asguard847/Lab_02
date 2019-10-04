package com.otto.lab2.service.impl;

import com.otto.lab2.model.Sentence;
import com.otto.lab2.model.Text;
import com.otto.lab2.service.ParsingService;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ParsingServiceImplTest {

    public static final String INPUT = "aaa aaa. bb bb bb bb bb? ccc ccc ccc ccc ccc cc ccc cc!";

    ParsingService service = new ParsingServiceImpl();

    @Test
    public void testParser() {

        Text text = service.parseText(INPUT);
        assertEquals(3, text.getSentences().size());
        assertEquals(2, text.getSentences().get(0).getWordCount());
        assertEquals(5, text.getSentences().get(1).getWordCount());
        assertEquals(8, text.getSentences().get(2).getWordCount());

    }

}