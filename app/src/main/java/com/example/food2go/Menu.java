package com.example.food2go;

import java.util.ArrayList;

public class Menu
{
    //initialize variables
    ArrayList<MenuItem> menu = new ArrayList<>();

    //adds a menuItem to menu using parametes
    public void addMenuItem( double price, String item_name, String feedback )
    {
        MenuItem new_item = new MenuItem( price, item_name, feedback );
        this.menu.add( new_item );
    }

    //adds a menuItem object from param to menu
    public void addMenuItem( MenuItem item )
    {
        this.menu.add( item );
    }

    //removes a menuItem object from menu
    public void removeMenuItem( MenuItem item )
    {
        this.menu.remove( item );
    }
}
