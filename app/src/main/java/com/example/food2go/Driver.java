package com.example.food2go;

public class Driver extends User
{
    Boolean available;
    Order order;

    public Driver()
    {
        super();
        this.available = false;
    }

    public Driver(Boolean available,
                  double rating, String name, String username, String password,
                  String email, String phone_number)
    {
        super(rating, name, username, password, email, phone_number);
        this.available = available;
    }

    public void acceptOrder()
    {
        //TODO
    }

    public void finishOrder()
    {
        //TODO
    }

    @Override
    public void createAccount()
    {
        //TODO
    }

    @Override
    public void viewAccount()
    {
        //TODO
    }
}
