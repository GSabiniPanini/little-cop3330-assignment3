/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex41;

public class Solution41 {

    public static void main(String[] args) {
        //initializes FileHandler
        FileHandler myHandler = new FileHandler();

        //reads file and fills out array
        myHandler.readFile();
        //get array length
        myHandler.stringCount = StringParser.countStringArray(myHandler.array);

        //parses and alphabetizes string
        StringParser.sortStringArray(myHandler.array, myHandler.stringCount);

        //output
        myHandler.printToFile();
    }

}
