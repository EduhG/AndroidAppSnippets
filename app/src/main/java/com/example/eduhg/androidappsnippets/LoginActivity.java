package com.example.eduhg.androidappsnippets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    Button loginButton;
    EditText userEmail;
    EditText userPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userEmail = (EditText) findViewById(R.id.editText);
        userPassword = (EditText) findViewById(R.id.editText2);
        loginButton = (Button) findViewById(R.id.button);

        loginButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (userEmail.getText().toString().equals("admin@admin.com") && userPassword.getText().toString().equals("admin")) {
            Intent i = new Intent(LoginActivity.this, MoviesActivity.class);
            startActivity(i);
        }
    }
}
