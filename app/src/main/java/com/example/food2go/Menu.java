package com.example.food2go;

import java.util.ArrayList;

public class Menu
{
    ArrayList<MenuItem> menu = new ArrayList<>();

    public void addMenuItem( double price, String item_name, String feedback )
    {
        MenuItem new_item = new MenuItem( price, item_name, feedback );
        this.menu.add( new_item );
    }

    public void addMenuItem( MenuItem item )
    {
        this.menu.add( item );
    }

    public void removeMenuItem( MenuItem item )
    {
        this.menu.remove( item );
    }
}
