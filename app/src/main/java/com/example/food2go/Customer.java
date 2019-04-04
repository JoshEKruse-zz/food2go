package com.example.food2go;

public class Customer extends User
{
    String address;
    Order order;

    //default constructor
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
    public void startOrder()
    {
        //createOrderItems list
        OrderItems orderItems = new OrderItems();

        //create order
        this.order = new Order();
        this.order.order_items = orderItems;
    }

    public void addToOrder( MenuItem item )
    {
        this.order.order_items.addToOrder( item );
    }

    public void addToOrder( double price, String item_name, String item_url, String feedback )
    {
        this.order.order_items.addToOrder( price, item_name, feedback );
    }

    public void submitOrder()
    {
        // find restaurant
        // find driver
    }

    public void rateItem( MenuItem item, String feedback )
    {
        //get index of MenuItem
        int index = this.order.order_items.order.indexOf( item );

        //add feedback to list of feedback strings
        this.order.order_items.order.get( index ).feedback.add( feedback );
    }

    public void rateDriver()
    {
        //TODO
    }

    public void leaveReview()
    {
        //TODO
    }

    public void createAccount( String address, double rating, String name, String username,
                               String password, String email, String phone_number )
    {
        this.rating = rating;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
    }

    @Override
    public void viewAccount()
    {
        //TODO
    }
}