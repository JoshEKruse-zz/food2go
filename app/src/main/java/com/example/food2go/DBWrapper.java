//package com.example.food2go;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.DatabaseErrorHandler;
//import android.database.sqlite.*;
//import android.util.*;
//
//public class DBWrapper extends SQLiteOpenHelper {
//    // https://www.youtube.com/watch?v=aQAIMY-HzL8
//    //https://www.tutorialspoint.com/android/android_sqlite_database.htm
//    private static final String TAG = "DatabaseHelper";
//
//    private static final String TABLE_NAME = "test_table";
//    private static final String COL1 = "ID";
//    private static final String COL2 = "name";
//
//    public DatabaseHelper(Context context)
//    {
//        super(context, TABLE_NAME, null, 1);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db)
//    {
//      String createTable = "CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, "
//              + COL2 +" TEXT)";
//      db.execSQL(createTable);
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int i, int j)
//    {
//        db.execSQL("DROP IF TABLE EXISTS " + TABLE_NAME);
//        onCreate(db);
//    }
//
//    public boolean addData(String item)
//    {
//        SQLiteDatabase db = this.getWritableDatabase();
//
//    }
//
//}
