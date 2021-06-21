/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex44;

import java.io.IOException;

public class Solution44 {
    public static void main(String[] args) throws IOException {
        //manually input path
        String path = "src/main/java/ex44/exercise44_input.json";

        //initialize JsonInput with path to read file
        JsonInput myInput = new JsonInput(path);

        //call readFile method to use Gson/Json to parse file and create objects
        myInput.readFile(path);

        //prompt for input

        //loop for input
            //retrieve object that matches input if found

            //if not found start over

        //print object
    }

}
