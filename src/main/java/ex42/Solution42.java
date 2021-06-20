/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex42;

import java.io.File;
import java.io.IOException;

public class Solution42 {

    public static void main(String[] args) {
        try {
            final String directory = new File("src/main/exercise41_input.txt").getCanonicalPath();

            System.out.println(directory);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    //open file

    //read lines in file and store in String/Char array

    //close file

    //split into tokens

    //make Worker class for each token
    //class has this.lastName this.firstName and this.salary

    //print table with printf without commas
}
