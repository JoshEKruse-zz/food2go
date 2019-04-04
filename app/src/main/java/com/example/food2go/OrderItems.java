package com.example.food2go;

import java.util.ArrayList;

public class OrderItems
{
    ArrayList<MenuItem> order = new ArrayList<MenuItem>();

    public void addToOrder( double price, String item_name, String feedback )
    {
        MenuItem new_item = new MenuItem( price, item_name, feedback );
        this.order.add( new_item );
    }

    public void addToOrder( MenuItem item )
    {
        this.order.add( item );
    }

    public void removeFromOrder( MenuItem item )
    {
        this.order.remove( item );
    }

    public int getQuantity()
    {
        return order.size();
    }

    public int getTotal()
    {
        int index;
        int total = 0;
        for(index = 0; index < order.size(); index++)
        {
            total += order.get( index ).price;
        }
        return total;
    }
}
