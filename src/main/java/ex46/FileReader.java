/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex46;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileReader {
    public String path;
    public String[] array = new String[100];
    public int size = 0;

    public FileReader(String path) {
        this.path = path;

        readFile(path);
    }

    public void readFile(String path) {
        //while loop till end of file that reads each line and stores in array
        Path dir = Paths.get(path);
        try(Scanner in = new Scanner(dir)) {
            int i=0;
            while(in.hasNext() && i < 100) {
                this.array[i++] = in.next();
                this.size++;
            }
        }
        catch (IOException | SecurityException e) {
            e.printStackTrace();
        }
    }

}
