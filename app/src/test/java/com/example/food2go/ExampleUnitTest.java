package com.example.food2go;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    String test_address = "1111 S. 14th Drive";
    double test_rating = 4;
    String test_name = "Test Tester";
    String test_username = "username";
    String test_password = "password";
    String test_email = "email@email.com";
    String test_phone = "555-555-5555";
    String test_opHours = "4:00 - 4:01";
    String test_logo = "logo.png";
    String test_review = "I hated it";
    double test_price = 10;

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void customer_isCorrect()
    {
        Customer test_customer = new Customer( test_address, test_rating, test_name, test_username,
                test_password, test_email, test_phone );

        //startOrder
        test_customer.startOrder();

        //addToOrder
        MenuItem test_item = new MenuItem( 4, test_name, test_review );
        test_customer.addToOrder( test_item );
        test_customer.addToOrder( 4, test_name, test_review );

        //submitOrder

        //rateItem
        test_customer.rateItem( test_item, test_review );
        assertEquals( test_customer.order.order_items.order.get( 0 ).feedback.get( 0 ),
                      test_review );

        //rateDriver
        //leaveReview

        //createAccount
        Customer test_customer_2nd = new Customer();
        test_customer_2nd.createAccount( test_address, test_rating, test_name, test_username,
                test_password, test_email, test_phone );
        assertEquals( test_customer_2nd.address, test_address );

        //viewAccount
    }

    @Test
    public void restaurant_isCorrect()
    {
        Restaurant test_restaurant = new Restaurant( test_opHours, test_logo, test_address,
                test_rating, test_name, test_username, test_password, test_email, test_phone );

        //acceptOrder
        Order test_order = new Order();
        test_restaurant.acceptOrder( test_order );
        assertEquals( test_restaurant.orders.get(0), test_order );

        //finishOrder
        test_restaurant.finishOrder(test_order);
        
        //createAccount
        Restaurant test_restaurant_2nd = new Restaurant();
        test_restaurant_2nd.createAccount( test_opHours, test_logo, test_address, test_rating,
                test_name, test_username, test_password, test_email, test_phone );
        assertEquals( test_restaurant_2nd.address, test_address );

        //viewAccount
    }

    @Test
    public void driver_isCorrect()
    {
        Driver test_driver = new Driver( true, test_rating, test_name, test_username,
                test_password, test_email, test_phone );

        //acceptOrder
        Order test_order = new Order();
        test_driver.acceptOrder( test_order );
        assertEquals( test_driver.order, test_order );

        //finishOrder
        test_driver.finishOrder();
        assertEquals( test_driver.order, null );

        //createAccount
        Customer test_driver_2nd = new Customer();
        test_driver_2nd.createAccount( test_address, test_rating, test_name, test_username,
                test_password, test_email, test_phone );
        assertEquals( test_driver_2nd.address, test_address );

        //viewAccount
    }

    @Test
    public void menu_isCorrect()
    {
        //addMenuItem
        Menu menu = new Menu();
        menu.addMenuItem( test_price, test_name, test_review );

        assertEquals( menu.menu.get(0).price, test_price, 0 );
        assertEquals( menu.menu.get(0).item_name, test_name );
        assertEquals( menu.menu.get(0).feedback.get(0), test_review );

        MenuItem item = new MenuItem( test_price, test_name, test_review );
        menu.addMenuItem( item );

        assertEquals( menu.menu.get(1).price, test_price, 0 );
        assertEquals( menu.menu.get(1).item_name, test_name );
        assertEquals( menu.menu.get(1).feedback.get(0), test_review );
    }

    @Test
    public void menuItem_isCorrect()
    {
        MenuItem item = new MenuItem( test_price, test_name, test_review );
        assertEquals( item.price, test_price, 0 );
        assertEquals( item.item_name, test_name );
        assertEquals( item.feedback.get(0), test_review );
    }

    @Test
    public void orderItems_isCorrect()
    {
        //addToOrder
        OrderItems order = new OrderItems();
        order.addToOrder( test_price, test_name, test_review );

        assertEquals( order.order.get(0).price, test_price, 0 );
        assertEquals( order.order.get(0).item_name, test_name );
        assertEquals( order.order.get(0).feedback.get(0), test_review );

        MenuItem item = new MenuItem( test_price, test_name, test_review );
        order.addToOrder( item );

        assertEquals( order.order.get(1).price, test_price, 0 );
        assertEquals( order.order.get(1).item_name, test_name );
        assertEquals( order.order.get(1).feedback.get(0), test_review );

        order.addToOrder( item );
        order.addToOrder( item );
        order.addToOrder( item );
        order.addToOrder( item );
        order.addToOrder( item );

        //getQuanity
        assertEquals( order.getQuantity(), 7 );

        //getTotal
        assertEquals( order.getTotal(), 70 );
    }

    @Test
    public void order_isCorrect()
    {
        //getStatus
        //updateStatus
    }

    @Test
    public void messaging_isCorrect()
    {
        //sendMessage
        //deleteMessage
    }

    @Test
    public void gps_isCorrect()
    {
        //displayMap
    }
}