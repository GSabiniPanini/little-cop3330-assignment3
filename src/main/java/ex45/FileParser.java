/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex45;

import java.util.ArrayList;

public class FileParser {

    //processes the array and returns a modified array[] string
    public String[] processArray(ArrayList<String> a1) {
        String[] temp = new String[a1.size()];
        String[] a2 = new String[10];
        int size = a1.size();
        //convert arrayList to string array by calling convertArrayList method and store strings in temp
        for(int i=0; i < a1.size(); i++) {
            temp[i] = convertArrayList(a1, i);
        }

        //replace instances of keyword with keyfix
        replace(temp, a2, size, "utilize", "use");

        return a2;
    }

    public void replace(String[] temp, String[] a2, int size, String s1, String s2) {
        //replaces occurrences of s1 in temp with s2 and stores resulting string in a2
        for(int i=0; i < size ;i++) {
            a2[i] = temp[i].replace(s1, s2);
        }
    }

    public String convertArrayList(ArrayList<String> a1, int index) {
        //converts the array list into a string array
        String temp = a1.get(index);
        return temp;
    }
}
