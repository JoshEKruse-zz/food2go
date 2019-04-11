package com.example.food2go;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.*;
import android.util.*;
import com.example.food2go.Backend.*;

public class DBWrapper extends SQLiteOpenHelper {
    // https://www.youtube.com/watch?v=aQAIMY-HzL8
    //https://www.tutorialspoint.com/android/android_sqlite_database.htm
    private static final int DB_VERSION = 1;

    private static final String DB_NAME = "FOOD_2_GO.db";

    private static final String CUSTOMER_TABLE = "CUSTOMER";
    private static final String COL_ID = "ID";
    private static final String COL_NAME = "name";
    private static final String COL_EMAIL = "email";
    private static final String COL_USERNAME = "username";
    private static final String COL_PASSWORD = "password";
    private static final String COL_PHONENUM = "phone_number";
    private static final String COL_ADDRESS = "address";
    private static final String COL_RATING = "rating";

    SQLiteDatabase proj_database;



    public DBWrapper(Context context)
    {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String createTable = "CREATE TABLE " + CUSTOMER_TABLE + " (ID INTEGER PRIMARY KEY NOT NULL" +
                " AUTOINCREMENT , name TEXT NOT NULL , username TEXT NOT NULL, " +
                "password TEXT NOT NULL, email TEXT NOT NULL, phone_number TEXT NOT NULL, rating TEXT" +
                " NOT NULL );";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int j)
    {
        db.execSQL("DROP TABLE IF EXISTS " + CUSTOMER_TABLE);
        onCreate(db);
    }

    public void insertCustomer(Customer cust)
    {
        proj_database = this.getWritableDatabase();
        ContentValues insert_vals = new ContentValues();
        insert_vals.put(COL_NAME, cust.getName());
        insert_vals.put(COL_ADDRESS, cust.getAddress());
        insert_vals.put(COL_EMAIL, cust.getEmail());
        insert_vals.put(COL_PASSWORD, cust.getPassword());
        insert_vals.put(COL_PHONENUM, cust.getPhone());
        insert_vals.put(COL_RATING, cust.getRating());
        insert_vals.put(COL_USERNAME, cust.getUsername());

        proj_database.insert(CUSTOMER_TABLE, null, insert_vals);

    }
}
