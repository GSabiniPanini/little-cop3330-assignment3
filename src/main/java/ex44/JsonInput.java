/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex44;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JsonInput {
    public String path;
    public List<Object> list;

    //Json constructor that stores path
    public JsonInput(String path) {
        this.path = path;
    }

    //the processing method that calls all other methods automatically
    //and stores them in instance variables
    public void readFile(String path) throws IOException {
        //create InputStream for Gson methods
        Scanner in = new Scanner(Paths.get(path));

        //initialize list of objects by calling all Gson methods using
        //input stream
        this.list = new ArrayList<>(readJsonStream(in));
    }

    public List<Object> readJsonStream(InputStream in) throws IOException {
        //this method will call other functions and manipulate the JsonReader to
        //fill a List<>
        JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
        try {
            return readProductArray(reader);
        } finally {
            reader.close();
        }
    }

    public List<Object> readProductArray(JsonReader reader) throws IOException {
        //this method will parse through the json file and create the objects
        List<Object> objects = new ArrayList<Object>();

        //loop for parsing file
        reader.beginArray();
        while (reader.hasNext()) {
            for(int i=0; i<3; i++) {
                objects.add(readObject(reader, i));
            }
        }
        reader.endArray();
        return objects;
    }
    
    public Object readObject(JsonReader reader, int i) throws IOException {
        //this method does the physical job of selection
        String name = null;
        double price = 0;
        int quantity = 0;

        reader.beginObject();
        while (reader.hasNext()) {
            //grab particular strings to indicate object variables
            String namething = reader.nextName();
            if(namething.equals("name")) {
                name = reader.nextString();
            } else if(namething.equals("price")) {
                price = reader.nextDouble();
            } else if(namething.equals("quantity")) {
                quantity = reader.nextInt();
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return new Object(name, price, quantity);
    }
}
