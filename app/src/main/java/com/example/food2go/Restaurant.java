package com.example.food2go;

import java.util.ArrayList;

public class Restaurant extends User
{
    //initialize variables
    String operation_hours;
    String logo_url;
    ArrayList<String> reviews;
    String address;
    ArrayList<Order> orders;

    //default constructor
    public Restaurant()
    {
        super();
        this.operation_hours = "";
        this.logo_url = "";
        this.reviews = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.address = "";
    }

    //param constructor
    public Restaurant(String operation_hours, String logo_url, String address,
                      double rating, String name, String username, String password,
                      String email, String phone_number)
    {
        super(rating, name, username, password, email, phone_number);
        this.operation_hours = operation_hours;
        this.logo_url = logo_url;
        this.reviews = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.address = address;
    }

    //adds Order to order var
    public void acceptOrder( Order order )
    {
        this.orders.add( order );
    }

    //removes Order from order var
    public void finishOrder( Order order )
    {
        this.orders.remove( order );
    }

    //Desc: if default construct used, this method can be used to update all information
    public void createAccount( String operation_hours, String logo_url, String address,
                               double rating, String name, String username,
                               String password, String email, String phone_number )
    {
        updateHours(operation_hours);
        updateLogo(logo_url);
        updateAddress(address);
        updateEmail(email);
        updateName(name);
        updatePassword(password);
        updatePhone(phone_number);
        updateRating(rating);
        updateUsername(username);
    }

    //Desc: specific functions to update parts of customer
    public void updateHours( String operation_hours ){ this.operation_hours = operation_hours; }
    public void updateLogo( String logo_url ){ this.logo_url = logo_url; }
    public void updateAddress( String address ){ this.address = address; }
    public void updateRating( double rating ){ this.rating = rating; }
    public void updateName( String name ){ this.name = name; }
    public void updateUsername( String username ){ this.username = username; }
    public void updatePassword( String password ){ this.password = password; }
    public void updateEmail( String email ){ this.email = email; }
    public void updatePhone( String phone_number ){ this.phone_number = phone_number; }

    @Override
    public void viewAccount()
    {
        //TODO
    }
}