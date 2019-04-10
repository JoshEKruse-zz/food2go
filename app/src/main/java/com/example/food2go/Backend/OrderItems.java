package com.example.food2go.Backend;

import java.util.ArrayList;

public class OrderItems
{
    //initialize variables
    ArrayList<MenuItem> order = new ArrayList<MenuItem>();

    //adds MenuItem object to order with parameters
    public void addToOrder( double price, String item_name, String feedback )
    {
        MenuItem new_item = new MenuItem( price, item_name, feedback );
        this.order.add( new_item );
    }

    //adds MenuItem object from parameter to order
    public void addToOrder( MenuItem item )
    {
        this.order.add( item );
    }

    //removes MenuItem object from order
    public void removeFromOrder( MenuItem item )
    {
        this.order.remove( item );
    }

    //Calculates the quantity or Order
    public int getQuantity()
    {
        return order.size();
    }

    //Calculates the total of an order
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
