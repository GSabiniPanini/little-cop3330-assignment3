/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex42;

public class Solution42 {

    public static void main(String[] args) {
        //initialize FileHandler
        FileHandler myHandler = new FileHandler();

        //reads file and fills array
        myHandler.readFile();

        //split input at "," and sort into different variables
        StringProcessor.processInput(myHandler.input, myHandler.fName, myHandler.lName, myHandler.salary);

        //print back table
        System.out.printf("%-10s%-10s%-10s%n%s%n", "Last", "First", "Salary", "--------------------------");
        for(int i=0; i<7; i++)
        {
            System.out.print(StringProcessor.getLineString(myHandler.fName, myHandler.lName, myHandler.salary, i));
        }
    }

}
