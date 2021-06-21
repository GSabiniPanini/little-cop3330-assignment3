/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex46;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrapherTest {

    @Test
    void getAsterisks_correct_with_many_numbers1() {
        Grapher test = new Grapher();
        int num = 1;

        String expected = "*";
        String actual = test.getAsterisks(num);

        assertEquals(expected, actual);
    }

    @Test
    void getAsterisks_correct_with_many_numbers2() {
        Grapher test = new Grapher();
        int num = 2;

        String expected = "**";
        String actual = test.getAsterisks(num);

        assertEquals(expected, actual);
    }

    @Test
    void getAsterisks_correct_with_many_numbers3() {
        Grapher test = new Grapher();
        int num = 3;

        String expected = "***";
        String actual = test.getAsterisks(num);

        assertEquals(expected, actual);
    }

    @Test
    void getAsterisks_correct_with_many_numbers4() {
        Grapher test = new Grapher();
        int num = 4;

        String expected = "****";
        String actual = test.getAsterisks(num);

        assertEquals(expected, actual);
    }

    @Test
    void getAsterisks_correct_with_many_numbers5() {
        Grapher test = new Grapher();
        int num = 5;

        String expected = "*****";
        String actual = test.getAsterisks(num);

        assertEquals(expected, actual);
    }

    @Test
    void getAsterisks_correct_with_many_numbers6() {
        Grapher test = new Grapher();
        int num = 6;

        String expected = "******";
        String actual = test.getAsterisks(num);

        assertEquals(expected, actual);
    }

    @Test
    void getAsterisks_correct_with_many_numbers7() {
        Grapher test = new Grapher();
        int num = 7;

        String expected = "*******";
        String actual = test.getAsterisks(num);

        assertEquals(expected, actual);
    }

    @Test
    void getAsterisks_correct_with_many_numbers8() {
        Grapher test = new Grapher();
        int num = 8;

        String expected = "********";
        String actual = test.getAsterisks(num);

        assertEquals(expected, actual);
    }

    @Test
    void getAsterisks_correct_with_many_numbers9() {
        Grapher test = new Grapher();
        int num = 9;

        String expected = "*********";
        String actual = test.getAsterisks(num);

        assertEquals(expected, actual);
    }

    @Test
    void getAsterisks_correct_with_many_numbers10() {
        Grapher test = new Grapher();
        int num = 10;

        String expected = "**********";
        String actual = test.getAsterisks(num);

        assertEquals(expected, actual);
    }
}