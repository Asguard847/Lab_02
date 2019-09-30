package com.otto.lab2.service.impl;

import com.otto.lab2.model.Sentence;
import com.otto.lab2.service.ParsingService;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ParsingServiceImplTest {

    ParsingService service = new ParsingServiceImpl();

    @Test
    public void testParser(){

        String input = "aaa aaa. bb bb bb bb bb? ccc ccc ccc ccc ccc cc ccc cc!";
        List<Sentence> output = service.parseText(input);
        assertEquals(3, output.size());
        assertEquals("aaa aaa.", output.get(0).getContent());
        assertEquals("bb bb bb bb bb?", output.get(1).getContent());
        assertEquals("ccc ccc ccc ccc ccc cc ccc cc!", output.get(2).getContent());
        assertEquals(2, output.get(0).getWordCounter());
        assertEquals(5, output.get(1).getWordCounter());
        assertEquals(8, output.get(2).getWordCounter());

    }

}