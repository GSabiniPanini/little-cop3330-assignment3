/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex43;

import java.util.Scanner;

public class Input {
    private final static Scanner in = new Scanner(System.in);
    String title;
    String author;
    boolean flag1;
    boolean flag2;

    //stores values into variables
    public void storeValues() {
        this.title = getSiteName();
        this.author = getAuthor();
        this.flag1 = isJavaScript(getInput1());
        this.flag2 = isCSS(getInput2());
    }

    //scan for site name
    public String getSiteName() {
        System.out.print("Site name: ");
        String name = in.nextLine();
        return name;
    }

    //scan for author
    public String getAuthor() {
        System.out.print("Author: ");
        String author = in.nextLine();
        return author;
    }

    //scan for whether there is a JavaScript file
    public boolean isJavaScript(String string) {
        boolean bool = string.equalsIgnoreCase("y");
        return bool;
    }

    //scan for whether there is a CSS file
    public boolean isCSS(String string) {
        boolean bool = string.equalsIgnoreCase("y");
        return bool;
    }

    public String getInput1() {
        System.out.print("Do you want a folder for JavaScript (y or n)? ");
        String response = in.next();
        return response;
    }

    public String getInput2() {
        System.out.print("Do you want a folder for CSS (y or n)? ");
        String response = in.next();
        return response;
    }
}
