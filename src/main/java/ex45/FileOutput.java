/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex45;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class FileOutput {
    String path;
    String name;
    String[] array;
    int length;

    public FileOutput(String path, String name, String[] array, int length) {
        this.name = name;
        this.array = array;
        this.length = length;
        this.path = path + name;

        //print array into new file
        this.printOutput(name);
    }

    //builds the output string by looping getLineString function
    public void printOutput(String name) {
        //create new file
        createFile(name);
    }

    //returns formatted array element at index
    public String getLineString(String[] array, int index) {
        String string = String.format(array[index]);
        return string;
    }

    public void createFile(String name) {
        //create output file in right directory
        try(Formatter output = new Formatter(this.path)) {
            //print to output file by looping getLineString method
            String outputLine;
            for(int i = 0; i < this.length; i++) {
                outputLine = (getLineString(this.array, i));
                output.format("%s%n", outputLine);
            }
        }
        catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            e.printStackTrace();
        }
    }
}
