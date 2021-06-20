/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex45;

import java.util.Scanner;

public class Solution45 {

    public static void main(String[] args) {
        String path = "src/main/java/ex45/";
        String inputPath = path + "exercise45_input.txt";
        //Initialize FileInput object with path, which automatically invokes readFile method
        FileInput fileIn = new FileInput(inputPath);

        //Initialize FileParse to begin string processing
        FileParser parser = new FileParser();

        //prompt user for output file name
        Scanner in = new Scanner(System.in);
        System.out.print("Output file name? ");
        String name = in.nextLine();

        //Create FileOutput object while processing original string with parser.processArray() in the parameters
        //automatically prints output to file
        FileOutput fileOut = new FileOutput(path , name, parser.processArray(fileIn.array), fileIn.length);
    }
}
