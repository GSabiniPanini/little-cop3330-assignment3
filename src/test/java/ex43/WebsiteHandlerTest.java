/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteHandlerTest {

    @Test
    void jsFlags_read_properly_true1() {
        Input test = new Input();

        boolean expected = true;
        boolean actual = test.isJavaScript("y");
    }

    @Test
    void jsFlags_read_properly_true2() {
        Input test = new Input();

        boolean expected = true;
        boolean actual = test.isJavaScript("Y");
    }

    @Test
    void jsFlags_read_properly_false1() {
        Input test = new Input();

        boolean expected = false;
        boolean actual = test.isJavaScript("n");
    }

    @Test
    void jsFlags_read_properly_false2() {
        Input test = new Input();

        boolean expected = false;
        boolean actual = test.isJavaScript("N");
    }

    @Test
    void cssFlags_read_properly_true1() {
        Input test = new Input();

        boolean expected = true;
        boolean actual = test.isCSS("y");
    }

    @Test
    void cssFlags_read_properly_true2() {
        Input test = new Input();

        boolean expected = true;
        boolean actual = test.isCSS("Y");
    }

    @Test
    void cssFlags_read_properly_false1() {
        Input test = new Input();

        boolean expected = false;
        boolean actual = test.isCSS("n");
    }

    @Test
    void cssFlags_read_properly_false2() {
        Input test = new Input();

        boolean expected = false;
        boolean actual = test.isCSS("N");
    }
}