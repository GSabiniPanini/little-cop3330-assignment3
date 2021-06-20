/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex43;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class WebsiteHandler {
    public String title;
    public String author;
    public boolean jsFlag;
    public boolean cssFlag;
    public String path = "src/main/java/ex43/";

    //website constructor that builds HTML on creation
    public WebsiteHandler(String title, String author, boolean flag1, boolean flag2)
    {
        //initialize into variables
        this.title = title;
        this.author = author;
        this.jsFlag = flag1;
        this.cssFlag = flag2;

        //call structure building method
        createStructure();
    }

    //method that builds the web structure
    public void createStructure() {
        //create website directory
        createWebsiteDir();
        //create author directory
        createTitleDir();
        //call index.html building method
        createIndexHTML();

        //check JavaScript flag
        if(this.jsFlag) {
            //create Javascript directory
            if(createJSDir())
            {
                System.out.println("Created ./website/" + this.title + "/js");
            }
        }

        //check CSS flag
        if(this.cssFlag) {
            //create CSS directory
            if(createCSSDir())
            {
                System.out.println("Created ./website/" + this.title + "/css");
            }
        }
    }

    public void createWebsiteDir() {
        File f1 = new File(this.path + "website/");
        this.path += "website/";
        f1.mkdir();
    }

    public void createTitleDir() {
        File f2 = new File(this.path + this.title);
        this.path += this.title;
        System.out.printf("Created ./website/%s%n", this.title);
        f2.mkdir();

    }

    public boolean createJSDir() {
        File f3 = new File(this.path + "/js");
        boolean bool = f3.mkdir();
        return bool;
    }

    public boolean createCSSDir() {
        File f4 = new File(this.path + "/css");
        boolean bool = f4.mkdir();
        return bool;
    }

    public void createIndexHTML() {
        //create index file in right directory
        try(Formatter output = new Formatter(this.path + "/index.html")) {
            //print HTML file
            output.format("<!DOCTYPE html><html><head><meta name =\"author\" content =\"%s\"><title>%s</title></head><body></body></html>", this.author, this.title);
            System.out.println("Created ./website/" + this.title + "/index.html");
        }
        catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            e.printStackTrace();
        }
    }
}

