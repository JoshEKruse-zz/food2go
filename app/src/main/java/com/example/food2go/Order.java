package com.example.food2go;

public class Order
{
    int current_status;
    Driver driver;
    Customer customer;
    Restaurant restaurant;

    public int getStatus()
    {
        return current_status;
    }

    public void updateStatus( int updated_status )
    {
        current_status = updated_status;
    }
}
