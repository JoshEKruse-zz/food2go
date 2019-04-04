package com.example.food2go;

public class MenuItem
{
    double price;
    String item_name;
    String item_url;
    String[] feedback;
    MenuItem next;

    MenuItem()
    {
        this.price = 0;
        this.item_name = "";
        this.item_url = "";
        //this.feedback = "";
        MenuItem next = null;
    }

    MenuItem(double price, String item_name, String item_url, String feedback, MenuItem next)
    {
        this.price = price;
        this.item_name = item_name;
        this.item_url = item_url;
        this.next = null;
    }
}
