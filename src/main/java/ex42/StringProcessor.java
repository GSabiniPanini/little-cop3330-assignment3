/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex42;

public class StringProcessor {
    public static void processInput(String[] input, String[] fname, String[] lname, int[] salary) {
        //loop through every string in input
        for(int i=0; i < 7; i++) {
            //split string into temp string
            String[] temp = input[i].split(",");

            //split temp into respective arrays
            fname[i] = temp[0];
            lname[i] = temp[1];
            salary[i] = Integer.parseInt(temp[2]);
        }
    }

    public static String getLineString(String[] fname, String[] lname, int[] salary, int index) {
        //format string
        String string = String.format("%-10s%-10s%-10d%n", fname[index], lname[index], salary[index]);
        return string;
    }
}
