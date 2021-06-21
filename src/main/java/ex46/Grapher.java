/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex46;

import java.util.ArrayList;
import java.util.Map;

public class Grapher {
    public void graphHistogram(ArrayList<Map.Entry<String, Integer>> freqlist) {
        for(Map.Entry<String, Integer> word : freqlist) {
            System.out.printf("%-10s%s%-20s%n", word.getKey(), ":", getAsterisks(word.getValue()));
        }
    }

    public String getAsterisks(int n){
        String line = "";
        for(int i=1;i<=n;i++) {
            line += "*";
        }
        return line;
    }
}
