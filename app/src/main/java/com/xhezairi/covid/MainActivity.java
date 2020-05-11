package com.xhezairi.covid;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener
{

    private final String USER_EMAIL = "arian@xhezairi.com";
    private final String USER_PASS = "123321";

    private EditText emailField, passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailField = findViewById(R.id.emailField);
        passwordField = findViewById(R.id.passwordField);
        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(v -> {
            String email = emailField.getText().toString();
            String pass = passwordField.getText().toString();

            if (!email.equals(USER_EMAIL) || !pass.equals(USER_PASS)) {
                Toast.makeText(MainActivity.this, "Wrong credentials!", Toast.LENGTH_SHORT).show();
                return;
            }

            // more expressions...
            Toast.makeText(MainActivity.this, "Welcome, you have been logged in!", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLogin:
                Toast.makeText(MainActivity.this, "Button clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnReset:
                this.emailField.setText("");
                this.passwordField.setText("");
                Toast.makeText(MainActivity.this, "Button clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
