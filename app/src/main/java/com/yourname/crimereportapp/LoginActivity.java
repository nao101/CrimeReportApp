package com.yourname.crimereportapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText usernameInput, passwordInput;
    Button loginBtn, registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameInput = findViewById(R.id.username);
        passwordInput = findViewById(R.id.password);
        loginBtn = findViewById(R.id.loginBtn);
        registerBtn = findViewById(R.id.registerBtn);

        loginBtn.setOnClickListener(v -> {
            String user = usernameInput.getText().toString();
            String pass = passwordInput.getText().toString();

            if (user.equals("admin") && pass.equals("admin123")) {
                startActivity(new Intent(this, MainActivity.class).putExtra("role", "Admin"));
            } else if (user.equals("police") && pass.equals("police123")) {
                startActivity(new Intent(this, MainActivity.class).putExtra("role", "Police"));
            } else if (user.equals("user") && pass.equals("user123")) {
                startActivity(new Intent(this, MainActivity.class).putExtra("role", "User"));
            } else {
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();
            }
        });

        registerBtn.setOnClickListener(v ->
                startActivity(new Intent(this, RegisterActivity.class)));
    }
}
