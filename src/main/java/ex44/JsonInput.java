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

    public JsonInput(String path) {
        this.path = path;

        readFile(path);
    }

    public void readFile(String path) throws IOException {
        //read json file and
        Scanner in = new Scanner(Paths.get(path));

        readJsonStream(in);
    }

    public List<Object> readJsonStream(InputStream in) throws IOException {
        JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
        try {
            return readProductArray(reader);
        } finally {
            reader.close();
        }
    }

    public List<Object> readProductArray(JsonReader reader) throws IOException {
        List<Object> objects = new ArrayList<Object>();

        reader.beginArray();
        while (reader.hasNext()) {
            objects.add(readObject(reader));
        }
        reader.endArray();
        return objects;
    }
    
    public Object readObject(JsonReader reader) throws IOException {
        String name;
        double price;
        int quantity;
    }
}
