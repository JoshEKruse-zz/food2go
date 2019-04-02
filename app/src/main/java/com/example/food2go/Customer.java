package com.example.food2go;

public class Customer extends User
{
    String address;

    public Customer()
    {
        super();
        this.address = "";
    }
    public Customer(String address,
                    double rating, String name, String username,
                    String password, String email, String phone_number)
    {
        super(rating, name, username, password, email, phone_number);
        this.address = address;
    }

    public void addToOrder()
    {
        //TODO
    }

    public void submitOrder()
    {
        //TODO
    }

    public void rateOrder()
    {
        //TODO
    }

    public void rateDriver()
    {
        //TODO
    }

    public void leaveReview()
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