package com.example.food2go.Backend;

public class Driver extends User
{
    //initialize variables
    Boolean available;
    Order order;

    //default constructor
    public Driver()
    {
        super();
        this.available = false;
    }

    //param constructor
    public Driver(Boolean available,
                  double rating, String name, String username, String password,
                  String email, String phone_number)
    {
        super(rating, name, username, password, email, phone_number);
        this.available = available;
    }

    //Desc: accepts an order, adds Order to order var
    public void acceptOrder( Order order )
    {
        this.order = order;
    }

    //Desc: finishes an order, removes order from order var
    public void finishOrder()
    {
        this.order = null;
    }

    //Desc: if default construct used, this method can be used to update all information
    public void createAccount( Boolean available, double rating, String name, String username,
                               String password, String email, String phone_number )
    {
        updateAvailable(available);
        updateEmail(email);
        updateName(name);
        updatePassword(password);
        updatePhone(phone_number);
        updateRating(rating);
        updateUsername(username);
    }

    //Desc: specific functions to update parts of customer
    public void updateRating( double rating ){ this.rating = rating; }
    public void updateName( String name ){ this.name = name; }
    public void updateUsername( String username ){ this.username = username; }
    public void updatePassword( String password ){ this.password = password; }
    public void updateEmail( String email ){ this.email = email; }
    public void updatePhone( String phone_number ){ this.phone_number = phone_number; }
    public void updateAvailable( Boolean available ){ this.available = available; }

    @Override
    public void viewAccount()
    {
        //TODO
    }
}
