package com.example.food2go;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PersonalCenter extends AppCompatActivity {
    private Button mReturnButton;
    private Button menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_user);
        mReturnButton = findViewById(R.id.returnBack);
        menuButton = findViewById(R.id.viewMenu);

    }
    public void back_to_login(View view) {
        //setContentView(R.layout.login);
        Intent intent3 = new Intent(PersonalCenter.this,MainActivity.class) ;
        startActivity(intent3);
        finish();

    }

    public void view_menu(View view) {
        Intent new_intent = new Intent(PersonalCenter.this, MenuActivity.class);
        startActivity(new_intent);
        finish();
    }
}
