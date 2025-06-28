package com.yourname.crimereportapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView welcomeMsg;
    Button reportBtn, viewReportsBtn, logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeMsg = findViewById(R.id.welcomeText);
        reportBtn = findViewById(R.id.reportBtn);
        viewReportsBtn = findViewById(R.id.viewReportsBtn);
        logoutBtn = findViewById(R.id.logoutBtn);

        String role = getIntent().getStringExtra("role");
        welcomeMsg.setText("Welcome, " + role);

        reportBtn.setOnClickListener(v ->
                startActivity(new Intent(this, EmergencyReportActivity.class)));

        viewReportsBtn.setOnClickListener(v ->
                startActivity(new Intent(this, ViewReportsActivity.class)));

        logoutBtn.setOnClickListener(v -> {
            finishAffinity(); // closes all activities
            startActivity(new Intent(this, LoginActivity.class));
        });
    }
}
