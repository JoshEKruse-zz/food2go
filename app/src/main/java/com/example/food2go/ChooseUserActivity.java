package com.example.food2go;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseUserActivity extends AppCompatActivity {

    private static final int REQUEST_SIGNUP = 0;

    Button _customerButton;
    Button _driverButton;
    Button _restaurantButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_user);

        Button _customerButton = findViewById(R.id.btn_customer);
        Button _driverButton = findViewById(R.id.btn_driver);
        Button _restaurantButton = findViewById(R.id.btn_restaurant);

        _customerButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // Start the Signup activity
                Intent intent = new Intent(getApplicationContext(), CustomerSignupActivity.class);
                startActivityForResult(intent, REQUEST_SIGNUP);
            }
        });

        _restaurantButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // Start the Signup activity
                Intent intent = new Intent(getApplicationContext(), RestSignupActivity.class);
                startActivityForResult(intent, REQUEST_SIGNUP);
            }
        });

        _driverButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // Start the Signup activity
                Intent intent = new Intent(getApplicationContext(), DriverSignupActivity.class);
                startActivityForResult(intent, REQUEST_SIGNUP);
            }
        });
    }
}
