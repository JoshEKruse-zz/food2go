package com.example.food2go;

public abstract class User
{
    double objrating;
    String name;
    String username;
    String password;
    String email;
    String phone_number;

    public User()
    {
        this.objrating = 0;
        this.name = "";
        this.username = "";
        this.password = "";
        this.email = "";
        this.phone_number = "";
    }

    public User( double rating, String name, String username, String password,
                 String email, String phone_number)
    {
         this.objrating = rating;
         this.name = name;
         this.username = username;
         this.password = password;
         this.email = email;
         this.phone_number = phone_number;
    }

    public void createAccount()
    {
        //TODO
    }

    public void viewAccount()
    {

    }
}
