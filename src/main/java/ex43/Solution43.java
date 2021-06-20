/*
 * UCF COP3330 Summer 2021 Assignment 3 Solution
 * Copyright 2021 Glenroy Little
 */

package ex43;

public class Solution43 {
    public static void main(String[] args) {
        //create input object
        Input input = new Input();

        //store all inputs into variables
        input.storeValues();

        //use stored variables to initialize WebsiteHandler Object
        WebsiteHandler myHandler = new WebsiteHandler(input.title, input.author, input.flag1, input.flag2);
    }
}
