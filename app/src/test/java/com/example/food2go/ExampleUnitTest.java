package com.example.food2go;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void customer_isCorrect()
    {
        Customer test_customer = new Customer( "1 S E 43", 4, "test",
                "user", "pass", "e@e.com", "5-5-5");

        assertEquals( "1 S E 43", test_customer.address );
    }

    @Test
    public void restaurant_isCorrect()
    {
        //TODO
    }

    @Test
    public void driver_isCorrect()
    {
        //TODO
    }

    @Test
    public void menu_isCorrect()
    {
        //TODO
    }

    @Test
    public void menuItem_isCorrect()
    {
        //TODO
    }

    @Test
    public void orderItems_isCorrect()
    {
        //TODO
    }

    @Test
    public void order_isCorrect()
    {
        //TODO
    }

    @Test
    public void messaging_isCorrect()
    {
        //TODO
    }

    @Test
    public void gps_isCorrect()
    {
        //TODO
    }
}