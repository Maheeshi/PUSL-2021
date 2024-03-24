package com.example.signlang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DisTen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_ten);

        Button button=findViewById(R.id.button_previous);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(DisTen.this,DisNine.class);
                startActivity(intent);
            }
        });

        Button button_n=findViewById(R.id.button_next);
        button_n.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(DisTen.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }


}