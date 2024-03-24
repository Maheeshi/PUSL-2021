package com.example.handwave;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Delayed transition to the Welcome_screen activity after 3 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create an Intent to launch the Welcome_screen activity
                Intent intent = new Intent(MainActivity.this, Welcome_screen.class);

                // Start the Welcome_screen activity
                startActivity(intent);

                // Finish the MainActivity so that pressing back button doesn't bring it back
                finish();
            }
        }, 3000); // 3000 milliseconds = 3 seconds
    }
}
