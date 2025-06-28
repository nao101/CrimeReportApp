package com.yourname.crimereportapp;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText usernameInput, passwordInput, confirmInput;
    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        usernameInput = findViewById(R.id.regUsername);
        passwordInput = findViewById(R.id.regPassword);
        confirmInput = findViewById(R.id.confirmPassword);
        registerBtn = findViewById(R.id.regButton);

        registerBtn.setOnClickListener(v -> {
            String user = usernameInput.getText().toString();
            String pass = passwordInput.getText().toString();
            String confirm = confirmInput.getText().toString();

            if (!pass.equals(confirm)) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Registered (simulated)", Toast.LENGTH_SHORT).show();
                finish(); // go back to login
            }
        });
    }
}
