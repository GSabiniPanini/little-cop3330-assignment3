/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution46 {
    public static void main(String[] args) {
        String path = "src/main/java/ex46/exercise46_input.txt";
        //Initialize file reader to read in.next() into String[]
        FileReader inFile = new FileReader(path);

        //Declare hashMap and create StringParser object for storing first map
        HashMap<String, Integer> tempMap;
        StringParser parser = new StringParser();

        //Initialize parser to parse String[] into map tempMap
        tempMap = parser.makeMap(inFile.array, inFile.size);

        //parse through tempMap and sort to frequency, and store new list in newList
        ArrayList<Map.Entry<String, Integer>> newList = parser.orderByFreq(tempMap);

        //line graph program to display histogram
        Grapher grapher = new Grapher();

        //print histogram
        grapher.graphHistogram(newList);

    }
}
