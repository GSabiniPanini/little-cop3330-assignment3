/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex45;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileInput {
    //initialize instance variables
    public ArrayList<String> array = new ArrayList<>();
    int length;

    //constructor for FileInput
    public FileInput (String path) {
        readFile(path);
        this.length = getArrayLength(array);
    }

    //read file and store in Array
    public void readFile(String path) {
        //while loop till end of file that reads each line and stores in array
        Path dir = Paths.get(path);
        try(Scanner in = new Scanner(dir)) {
            while(in.hasNext()) {
                this.array.add(in.nextLine());
            }
        }
        catch (IOException | SecurityException e) {
            e.printStackTrace();
        }
    }

    //get the array length
    public int getArrayLength(ArrayList<String> arr) {
        int length = arr.size();
        return length;
    }
}
