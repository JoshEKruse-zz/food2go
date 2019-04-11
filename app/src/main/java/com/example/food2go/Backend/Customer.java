package com.example.food2go.Backend;

public class Customer extends User
{
    //initiate variables
    String address;
    Order order;

    //default Constructor
    public Customer()
    {
        super();
        this.address = "";
    }

    //Param Constructor
    public Customer(String address,
                    double rating, String name, String username,
                    String password, String email, String phone_number)
    {
        super(rating, name, username, password, email, phone_number);
        this.address = address;
    }

    //Desc: Starts an customer order
    public void startOrder()
    {
        //create order
        this.order = new Order();
        //initiate order_items list
        this.order.order_items = new OrderItems();
    }

    //Desc : adds a menu item to the order
    //Input: MenuItem object
    public void addToOrder( MenuItem item )
    {
        this.order.order_items.addToOrder( item );
    }

    //Desc : adds a menu item to the order
    //Input: price of item, name of item, a string containing feedback of the item
    public void addToOrder( double price, String item_name, String feedback )
    {
        this.order.order_items.addToOrder( price, item_name, feedback );
    }

    //Desc: submits an order
    //      finds which restaurant the order is to be placed with
    //      finds an available driver
    public void submitOrder()
    {
        // find restaurant
        // find driver
    }

    //Desc: leaves feedback on a specefic MenuItem object
    public void rateItem( MenuItem item, String feedback )
    {
        //get index of MenuItem
        int index = this.order.order_items.order.indexOf( item );

        //add feedback to list of feedback strings
        this.order.order_items.order.get( index ).feedback.add( feedback );
    }

    //Desc: leaves a rating for the driver
    public void rateDriver()
    {
        //TODO
    }

    //Desc: leaves a review for the restaurant
    public void leaveReview()
    {
        //TODO
    }

    //Desc: if default construct used, this method can be used to update all information
    public void createAccount( String address, double rating, String name, String username,
                               String password, String email, String phone_number )
    {
        updateAddress(address);
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
    public void updateAddress( String address ){ this.address = address; }

    public String getAddress(){ return this.address; }

    public void viewAccount()
    {
        //TODO
    }
}