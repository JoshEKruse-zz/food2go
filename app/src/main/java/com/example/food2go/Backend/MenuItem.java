package com.example.food2go.Backend;

import java.util.ArrayList;

public class MenuItem
{
    double price;
    String item_name;
    ArrayList<String> feedback;

    //default constructor
    public MenuItem()
    {
        this.price = 0;
        this.item_name = "";
        this.feedback = new ArrayList<>();
    }

    //param constructor
    public MenuItem(double price, String item_name, String feedback )
    {
        this.price = price;
        this.item_name = item_name;
        this.feedback = new ArrayList<>();
        //if there is feedback left, add it
        if( !feedback.equals("") )
        {
            this.feedback.add( feedback );
        }
    }
}
