package com.example.food2go;

import java.sql.*;
import java.util.Random;

public class DBWrapper {

    private static Connection connect;

    public DBWrapper()
    {

        try {
            // get driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // establish connection
            connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/foodToGo", "root", "enterPassword");
        }
        catch (Exception excpt){System.out.println("Connection failed.  Error: " + excpt);}
    }


}
