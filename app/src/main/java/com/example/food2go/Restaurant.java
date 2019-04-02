package com.example.food2go;

public class Restaurant extends User
{
    String operation_hours;
    String logo_url;
    String[] reviews;
    String address;

    public Restaurant()
    {
        super();
        this.operation_hours = "";
        this.logo_url = "";
        //this.reviews = ;
        this.address = "";
    }
    public Restaurant(String operation_hours, String logo_url, String address,
                      double rating, String name, String username, String password,
                      String email, String phone_number)
    {
        super(rating, name, username, password, email, phone_number);
        this.operation_hours = operation_hours;
        this.logo_url = logo_url;
        //this.reviews = ;
        this.address = address;
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