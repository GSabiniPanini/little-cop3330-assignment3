/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex41;

import java.util.ArrayList;

public class StringParser {
    //sortStringArray(stringArray : ArrayList<String>) : void
    public static void sortStringArray(ArrayList<String> sArray, int count) {
        //takes an array and sorts array alphabetically
        sArray.sort(String::compareToIgnoreCase);
    }

    //countStringArray(stringArray : ArrayList<String>) : int
    public static int countStringArray(ArrayList<String> array){
        //gets the length of array
        int count = array.size();
        return count;
    }

}
