package com.example.signlang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DisSeven extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_seven);

        Button button_n=findViewById(R.id.button_next);
        button_n.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(DisSeven.this,DisEight.class);
                startActivity(intent);
            }
        });

        Button button_p=findViewById(R.id.button_previous);
        button_p.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(DisSeven.this,DisSix.class);
                startActivity(intent);
            }
        });
    }
}