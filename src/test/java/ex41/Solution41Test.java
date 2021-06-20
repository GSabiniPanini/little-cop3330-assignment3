/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex41;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    @Test
    void countStringArray_returns_right_int1() {
        ArrayList<String> test = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            test.add("Hello");
        }
        int expected = 5;
        int actual = StringParser.countStringArray(test);

        assertEquals(expected, actual);
    }

    @Test
    void countStringArray_returns_right_int2() {
        ArrayList<String> test = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            test.add("Hello");
        }
        int expected = 10;
        int actual = StringParser.countStringArray(test);

        assertEquals(expected, actual);
    }

    @Test
    void getFileLine_returns_correct_string1() {
        FileHandler test = new FileHandler();
        test.array.add("Hello");
        test.array.add("My");
        test.array.add("Name");
        test.array.add("is");
        test.array.add("Difo");
        test.array.add("Haha!");

        String expected = "My";
        String actual = test.getFileLine(1);

        assertEquals(expected, actual);
    }

    @Test
    void getFileLine_returns_correct_string2() {
        FileHandler test = new FileHandler();
        test.array.add("Hello");
        test.array.add("My");
        test.array.add("Name");
        test.array.add("is");
        test.array.add("Difo");
        test.array.add("Haha!");

        String expected = "Haha!";
        String actual = test.getFileLine(5);

        assertEquals(expected, actual);
    }
}