package com.example.food2go.Backend;

public abstract class User
{
    double rating;
    String name;
    String username;
    String password;
    String email;
    String phone_number;

    public User()
    {
        this.rating = 0;
        this.name = "";
        this.username = "";
        this.password = "";
        this.email = "";
        this.phone_number = "";
    }

    public User( double rating, String name, String username, String password,
                 String email, String phone_number)
    {
         this.rating = rating;
         this.name = name;
         this.username = username;
         this.password = password;
         this.email = email;
         this.phone_number = phone_number;
    }

    public double getRating(){ return this.rating; }
    public String getName(){ return this.name; }
    public String getUsername(){ return this.username; }
    public String getPassword(){ return this.password; }
    public String getEmail(){ return this.email; }
    public String getPhone(){ return this.phone_number; }

    public void createAccount()
    {
        //TODO
    }

    public void viewAccount()
    {

    }
}
