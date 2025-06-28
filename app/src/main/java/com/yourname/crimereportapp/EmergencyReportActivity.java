package com.yourname.crimereportapp;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class EmergencyReportActivity extends AppCompatActivity {

    EditText locationInput, descriptionInput;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_report);

        locationInput = findViewById(R.id.inputLocation);
        descriptionInput = findViewById(R.id.inputDescription);
        submitBtn = findViewById(R.id.submitReportBtn);

        submitBtn.setOnClickListener(v -> {
            String loc = locationInput.getText().toString();
            String desc = descriptionInput.getText().toString();

            if (loc.isEmpty() || desc.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Emergency report submitted (simulated)", Toast.LENGTH_SHORT).show();
                locationInput.setText("");
                descriptionInput.setText("");
            }
        });
    }
}
