/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex45;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FileParserTest {

    @Test
    void processArray_returns_properly_processed_array() {
        FileParser test = new FileParser();
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("He");
        a1.add("utilizes");
        a1.add("the");
        a1.add("word");
        a1.add("utilize");
        a1.add("lol");

        String[] expected = {"He", "uses", "the", "word", "use", "lol"};
        String[] actual = test.processArray(a1);

        assertEquals(actual[1], expected[1]);
    }

    @Test
    void convertArrayList_converts_array_correctly() {
        FileParser test = new FileParser();
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("He");
        a1.add("utilizes");
        a1.add("the");
        a1.add("word");
        a1.add("utilize");
        a1.add("lol");

        String expected = "lol";
        String actual = test.convertArrayList(a1,5);

        assertEquals(expected, actual);
    }

    @Test
    void getLineString_returns_correct_string1() {
        String[] a1 = {"this", "test", "is", "for", "Difo"};
        FileOutput test = new FileOutput("", "", a1, 5);

        String expected = "Difo";
        String actual = test.getLineString(a1, 4);

        assertEquals(actual, expected);
    }

    @Test
    void getLineString_returns_correct_string2() {
        String[] a1 = {"this", "test", "is", "for", "Difo"};
        FileOutput test = new FileOutput("", "", a1, 5);

        String expected = "test";
        String actual = test.getLineString(a1, 1);

        assertEquals(actual, expected);
    }
}