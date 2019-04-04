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
    String[] test_reviews = {"I hated it", "I hated it more" };

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
        MenuItem test_item = new MenuItem( 4, "", "",
                "", null );
        test_customer.addToOrder( test_item );
        test_customer.addToOrder( 4, "", "", "" );

        //submitOrder
        //rateItem
        //test_customer.rateItem( test_item, test_reviews[0] );
        //assertEquals( test_item.feedback[0], test_reviews[0] );

        //rateDriver
        //leaveReview
        //createAccount
        //viewAccount
    }

    @Test
    public void restaurant_isCorrect()
    {
        Restaurant test_restaurant = new Restaurant( test_opHours, test_logo, test_address,
                test_rating, test_name, test_username, test_password, test_email, test_phone );

        //acceptOrder
        //finishOrder
        //createAccount
        //viewAccount
    }

    @Test
    public void driver_isCorrect()
    {
        Driver test_driver = new Driver( true, test_rating, test_name, test_username,
                test_password, test_email, test_phone );

        //acceptOrder
        //finishOrder
        //createAccount
        //viewAccount
    }

    @Test
    public void menu_isCorrect()
    {
        //addMenuItem
        //removeMenuItem
    }

    @Test
    public void menuItem_isCorrect()
    {
        //TODO
    }

    @Test
    public void orderItems_isCorrect()
    {
        //addToOrder
        //removeFromOrder
        //getQuanity
        //getTotal
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