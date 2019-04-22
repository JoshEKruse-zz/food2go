package com.example.food2go;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.food2go.Backend.Customer;

public class CustomerSignUpActivity extends AppCompatActivity
{
    private static final String TAG = "CustomerSignUpActivity";
    private static final int REQUEST_signUp = 0;

    EditText _nameText;
    EditText _emailText;
    EditText _usernameText;
    EditText _passwordText;
    EditText _phoneText;
    EditText _addressText;
    Button _signUpButton;
    TextView _loginLink;

    private mUserDataManager mUserDataManager;


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_signup);

        _nameText = findViewById(R.id.input_name);
        _emailText = findViewById(R.id.input_email);
        _usernameText = findViewById(R.id.input_username);
        _passwordText = findViewById(R.id.input_password);
        _phoneText = findViewById(R.id.input_phone);
        _addressText = findViewById(R.id.input_address);
        _signUpButton = findViewById(R.id.btn_signUp);
        _loginLink = findViewById(R.id.link_login);

        _signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });

        _loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finish the registration screen and return to the Login activity
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivityForResult(intent, REQUEST_signUp);
            }
        });

        if (mUserDataManager == null) {
            mUserDataManager = new mUserDataManager(this);
            mUserDataManager.openDataBase();  //create local database
        }


    }

    public void signUp()
    {
 /**       Log.d(TAG, "signUp");

        if (!validate()) {
            onsignUpFailed();
            return;
        }

        _signUpButton.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(CustomerSignUpActivity.this,
                R.style.AppTheme);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Creating Account...");
        progressDialog.show();

        //-- signUp --
        String name = _nameText.getText().toString();
        String email = _emailText.getText().toString();
        String username = _usernameText.getText().toString();
        String password = _passwordText.getText().toString();
        String phone = _phoneText.getText().toString();
        String address = _addressText.getText().toString();

        //TODO

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // On complete call either onsignUpSuccess or onsignUpFailed
                        // depending on success
                        onsignUpSuccess();
                        // onsignUpFailed();
                        progressDialog.dismiss();
                    }
                }, 3000);
  **/

        if ( isUserNameAndPwdValid() ) {
            String name = _nameText.getText().toString().trim();
            String email = _emailText.getText().toString().trim();
            String username = _usernameText.getText().toString().trim();
            String password = _passwordText.getText().toString().trim();
            String phone = _phoneText.getText().toString().trim();
            //Check if the test_user exists
            int count = mUserDataManager.findUserByName(name);

            //when test_user already exists, giving the prompt
            if (count > 0) {
                Toast.makeText(this, getString(R.string.name_already_exist, username), Toast.LENGTH_SHORT).show();
                return;
            }

            mUserData mUser = new mUserData(username, password);
            mUserDataManager.openDataBase();
            //create new test_user information
            long flag = mUserDataManager.insertUserData(mUser);
            if (flag == -1) {
                Toast.makeText(this, getString(R.string.register_fail), Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, getString(R.string.register_success), Toast.LENGTH_SHORT).show();
                Intent intent_Register_to_Login = new Intent(CustomerSignUpActivity.this, MainActivity.class);    //切换User Activity至Login Activity
                startActivity(intent_Register_to_Login);
                finish();
            }
        }
    }

    public boolean isUserNameAndPwdValid() {
        if (_nameText.getText().toString().trim().equals("")) {
            Toast.makeText(this, getString(R.string.name_empty),
                    Toast.LENGTH_SHORT).show();
            return false;
        } else if (_passwordText.getText().toString().trim().equals("")) {
            Toast.makeText(this, getString(R.string.pwd_empty),
                    Toast.LENGTH_SHORT).show();
            return false;
        }else if(_emailText.getText().toString().trim().equals("")) {
            Toast.makeText(this, getString(R.string.pwd_check_empty),
                    Toast.LENGTH_SHORT).show();
            return false;
        }else if(_usernameText.getText().toString().trim().equals("")) {
            Toast.makeText(this, getString(R.string.username_empty),
                    Toast.LENGTH_SHORT).show();
        } else if (_phoneText.getText().toString().trim().equals("")) {
            Toast.makeText(this, getString(R.string.phone_empty),
                    Toast.LENGTH_SHORT).show();

        }
        return true;
    }



    public void onsignUpSuccess()
    {
        _signUpButton.setEnabled(true);
        setResult(RESULT_OK, null);
        finish();
    }

    public void onsignUpFailed()
    {
        Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();

        _signUpButton.setEnabled(true);
    }

    public boolean validate()
    {
        boolean valid = true;

        String name = _nameText.getText().toString();
        String email = _emailText.getText().toString();
        String username = _usernameText.getText().toString();
        String password = _passwordText.getText().toString();
        String phone = _phoneText.getText().toString();
        String address = _addressText.getText().toString();

        //Name
        if (name.isEmpty() || name.length() < 3)
        {
            _nameText.setError("at least 3 characters");
            valid = false;
        } else {
            _nameText.setError(null);
        }

        //Email
        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            _emailText.setError("enter a valid email address");
            valid = false;
        } else {
            _emailText.setError(null);
        }

        //Username
        if (username.isEmpty())
        {
            _usernameText.setError("enter a valid username");
            valid = false;
        } else {
            _usernameText.setError(null);
        }

        //Password
        if (password.isEmpty() || password.length() < 4 || password.length() > 10)
        {
            _passwordText.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            _passwordText.setError(null);
        }

        //Phone Number
        if (phone.isEmpty() || !Patterns.PHONE.matcher(phone).matches())
        {
            _phoneText.setError("enter a valid phone number");
            valid = false;
        } else {
            _phoneText.setError(null);
        }

        //Address
        if (address.isEmpty())
        {
            _addressText.setError("enter a valid address");
            valid = false;
        } else {
            _addressText.setError(null);
        }

        return valid;
    }
}
