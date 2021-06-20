/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex42;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileHandler {
    //initialize variables
    public String[] input = new String[7];
    public String[] fName = new String[7];
    public String[] lName = new String[7];
    public int[] salary = new int[7];

    //read the file and put into array
    public void readFile() {

        try {
            Path dir = Paths.get("src/main/java/ex42/exercise42_input.txt");

            Scanner in = new Scanner(dir);

            //loops in.nextLine() to fill out input array
            for(int i=0; i < 7; i++) {
                this.input[i] = readFileLine(in);
            }

        }
        catch(IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
    }

    //reads one line of the input file and stores it in a variable
    public String readFileLine(Scanner in)
    {
        String string = in.nextLine();
        return string;
    }

}
