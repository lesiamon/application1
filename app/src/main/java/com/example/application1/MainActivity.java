package com.example.application1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the EditText fields and the Button
        EditText nameEditText = findViewById(R.id.editTextText);
        EditText emailEditText = findViewById(R.id.editTextTextEmailAddress);
        EditText passwordEditText = findViewById(R.id.editTextTextPassword);
        Button submitButton = findViewById(R.id.button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        String name =nameEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

            // Check if all fields are filled
            if (!name.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
                // All fields are filled, you can perform further actions here
                // For example, you can display a message or process the data
                // In this example, we'll show a toast message
                String message = "Name: " + name + "\nEmail: " + email + "\nPassword: " + password;
                showToast(message);
            } else {
                // At least one field is empty, display an error message
                showToast("Please fill in all fields.");

              }
         }
    });
}

    // Helper method to show a toast message
    private void showToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}