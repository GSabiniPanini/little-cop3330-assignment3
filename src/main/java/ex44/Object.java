/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex44;

public class Object {
    //Object class for Json file
    //used by JsonInput class
    public String name;
    public double price;
    public int quantity;

    //constructor for Object
    public Object(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
