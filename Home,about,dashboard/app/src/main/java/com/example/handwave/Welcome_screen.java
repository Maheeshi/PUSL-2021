package com.example.handwave;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        // Assuming you have a button in your welcome screen layout with id continue_button
        Button continueButton = findViewById(R.id.getStartedButton);

        // Set a click listener on the button
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to launch the Home_screen activity
                Intent intent = new Intent(Welcome_screen.this, Home_screen.class);

                // Start the Home_screen activity
                startActivity(intent);

                // Finish the Welcome_screen activity
                finish();
            }
        });
    }
}
