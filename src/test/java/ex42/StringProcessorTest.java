/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex42;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    @Test
    void getLineString_returns_correct_string1() {
        FileHandler test = new FileHandler();
        test.input[0] = "Ling,Mai,55900";
        test.input[1] = "Johnson,Jim,56500";
        test.input[2] = "Jones,Aaron,46000";
        test.input[3] = "Jones,Chris,34500";
        test.input[4] = "Swift,Geoffrey,14200";
        test.input[5] = "Xiong,Fong,65000";
        test.input[6] = "Zarnecki,Sabrina,51500";
        StringProcessor.processInput(test.input, test.fName, test.lName, test.salary);
        int num = 0;

        String expected = String.format("%-10s%-10s%-10d%n", test.fName[num], test.lName[num], test.salary[num]);
        String actual = StringProcessor.getLineString(test.fName, test.lName, test.salary, num);
    }

    @Test
    void getLineString_returns_correct_string2() {
        FileHandler test = new FileHandler();
        test.input[0] = "Ling,Mai,55900";
        test.input[1] = "Johnson,Jim,56500";
        test.input[2] = "Jones,Aaron,46000";
        test.input[3] = "Jones,Chris,34500";
        test.input[4] = "Swift,Geoffrey,14200";
        test.input[5] = "Xiong,Fong,65000";
        test.input[6] = "Zarnecki,Sabrina,51500";
        StringProcessor.processInput(test.input, test.fName, test.lName, test.salary);
        int num = 1;

        String expected = String.format("%-10s%-10s%-10d%n", test.fName[num], test.lName[num], test.salary[num]);
        String actual = StringProcessor.getLineString(test.fName, test.lName, test.salary, num);

        assertEquals(expected, actual);
    }

    @Test
    void getLineString_returns_correct_string3() {
        FileHandler test = new FileHandler();
        test.input[0] = "Ling,Mai,55900";
        test.input[1] = "Johnson,Jim,56500";
        test.input[2] = "Jones,Aaron,46000";
        test.input[3] = "Jones,Chris,34500";
        test.input[4] = "Swift,Geoffrey,14200";
        test.input[5] = "Xiong,Fong,65000";
        test.input[6] = "Zarnecki,Sabrina,51500";
        StringProcessor.processInput(test.input, test.fName, test.lName, test.salary);
        int num = 2;

        String expected = String.format("%-10s%-10s%-10d%n", test.fName[num], test.lName[num], test.salary[num]);
        String actual = StringProcessor.getLineString(test.fName, test.lName, test.salary, num);

        assertEquals(expected, actual);
    }

    @Test
    void getLineString_returns_correct_string4() {
        FileHandler test = new FileHandler();
        test.input[0] = "Ling,Mai,55900";
        test.input[1] = "Johnson,Jim,56500";
        test.input[2] = "Jones,Aaron,46000";
        test.input[3] = "Jones,Chris,34500";
        test.input[4] = "Swift,Geoffrey,14200";
        test.input[5] = "Xiong,Fong,65000";
        test.input[6] = "Zarnecki,Sabrina,51500";
        StringProcessor.processInput(test.input, test.fName, test.lName, test.salary);
        int num = 3;

        String expected = String.format("%-10s%-10s%-10d%n", test.fName[num], test.lName[num], test.salary[num]);
        String actual = StringProcessor.getLineString(test.fName, test.lName, test.salary, num);

        assertEquals(expected, actual);
    }

    @Test
    void getLineString_returns_correct_string5() {
        FileHandler test = new FileHandler();
        test.input[0] = "Ling,Mai,55900";
        test.input[1] = "Johnson,Jim,56500";
        test.input[2] = "Jones,Aaron,46000";
        test.input[3] = "Jones,Chris,34500";
        test.input[4] = "Swift,Geoffrey,14200";
        test.input[5] = "Xiong,Fong,65000";
        test.input[6] = "Zarnecki,Sabrina,51500";
        StringProcessor.processInput(test.input, test.fName, test.lName, test.salary);
        int num = 4;

        String expected = String.format("%-10s%-10s%-10d%n", test.fName[num], test.lName[num], test.salary[num]);
        String actual = StringProcessor.getLineString(test.fName, test.lName, test.salary, num);

        assertEquals(expected, actual);
    }

    @Test
    void getLineString_returns_correct_string6() {
        FileHandler test = new FileHandler();
        test.input[0] = "Ling,Mai,55900";
        test.input[1] = "Johnson,Jim,56500";
        test.input[2] = "Jones,Aaron,46000";
        test.input[3] = "Jones,Chris,34500";
        test.input[4] = "Swift,Geoffrey,14200";
        test.input[5] = "Xiong,Fong,65000";
        test.input[6] = "Zarnecki,Sabrina,51500";
        StringProcessor.processInput(test.input, test.fName, test.lName, test.salary);
        int num = 5;

        String expected = String.format("%-10s%-10s%-10d%n", test.fName[num], test.lName[num], test.salary[num]);
        String actual = StringProcessor.getLineString(test.fName, test.lName, test.salary, num);

        assertEquals(expected, actual);
    }

    @Test
    void getLineString_returns_correct_string7() {
        FileHandler test = new FileHandler();
        test.input[0] = "Ling,Mai,55900";
        test.input[1] = "Johnson,Jim,56500";
        test.input[2] = "Jones,Aaron,46000";
        test.input[3] = "Jones,Chris,34500";
        test.input[4] = "Swift,Geoffrey,14200";
        test.input[5] = "Xiong,Fong,65000";
        test.input[6] = "Zarnecki,Sabrina,51500";
        StringProcessor.processInput(test.input, test.fName, test.lName, test.salary);
        int num = 6;

        String expected = String.format("%-10s%-10s%-10d%n", test.fName[num], test.lName[num], test.salary[num]);
        String actual = StringProcessor.getLineString(test.fName, test.lName, test.salary, num);

        assertEquals(expected, actual);
    }
}