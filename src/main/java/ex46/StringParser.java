/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex46;

import java.util.*;
import java.util.Map.Entry;

public class StringParser {
    public String[] oldArray;

    public HashMap<String, Integer> makeMap(String[] array, int size) {
        this.oldArray = new String[size];
        this.oldArray = array;

        HashMap<String, Integer> temp = new HashMap<>();

        //populate temp map
        for(String key: array) {
            int cur_val = 0;

            //get current value at key
            if(temp.get(key) != null) {
                cur_val = temp.get(key);
            }

            //add one to map at key
            temp.put(key, cur_val + 1);
        }

        return temp;
    }

    public ArrayList<Entry<String, Integer>> orderByFreq(HashMap<String, Integer> tempMap) {
        Set<Entry<String, Integer>> set = tempMap.entrySet();
        ArrayList<Entry<String, Integer>> list = new ArrayList<>(set);

        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        
        return list;
    }


}
