package com.example.food2go;

import java.util.ArrayList;

public class MenuItem
{
    double price;
    String item_name;
    ArrayList<String> feedback;

    public MenuItem()
    {
        this.price = 0;
        this.item_name = "";
        this.feedback = new ArrayList<>();
    }

    public MenuItem(double price, String item_name, String feedback )
    {
        this.price = price;
        this.item_name = item_name;
        this.feedback = new ArrayList<>();
        this.feedback.add( feedback );
    }
}
