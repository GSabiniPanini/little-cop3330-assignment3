/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex41;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileHandler {
    //initialize variables
    public ArrayList<String> array = new ArrayList<>();
    public int stringCount = 0;

    //readFile() : void
    public void readFile() {

        try {
            Path path = Paths.get("exercise41_input.txt");

            Scanner in = new Scanner(path);

            //loops readFileLine() to fill out array
            while(in.hasNext()) {
                this.array.add(readFileLine(in));
            }

        }
        catch(IOException | NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
    }

    //readFileLine() : String
    public String readFileLine(Scanner in)
    {
        //reads one line of the input file and stores it in a variable
        String string = in.nextLine();
        return string;
    }

    //printToFile() : void
    public void printToFile() {

        //open or create output file
        try(Formatter output = new Formatter("src/main/java/ex41/exercise41_output.txt")) {
            output.format("%s%d%s%n%s%n", "Total of ", this.stringCount, " names", "-----------------");

            //loop getFileLine() to print array as a list
            for(int i = 0; i<this.stringCount; i++)
            {
                output.format("%s%n", getFileLine(i));
            }
        }
        catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            e.printStackTrace();
        }
    }

    //getFileLine(index : int) : String
    public String getFileLine(int index) {
        //returns element array[index] as String
        String line = this.array.get(index);
        return line;
    }

}

